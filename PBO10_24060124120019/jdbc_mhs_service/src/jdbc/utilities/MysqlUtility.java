/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/**
 *
 * @author asust
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               String url = "jdbc:mysql://localhost:3306/pbo";
               
               String user = "root";
               String password = "ikan0710";
               
               koneksi = DriverManager.getConnection(url, user, password);
               if (koneksi != null) {
                   System.out.println("Koneksi berhasil");
               }
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException("Gagal koneksi database", e);
            }
        }
        return koneksi;
    }
    
    public static void executeQuery(String query) throws SQLException {
        try(Statement s = koneksi.createStatement()) {
            s.executeUpdate(query);
        }
    }
}