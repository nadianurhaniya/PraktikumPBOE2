import java.sql.*;

/*
 * File     : MySQLPersonDAO.java
 * Deskripsi: implementasi PersonDAO untuk MySQL
 * Pembuat  : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal  : 20 Mei 2026
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        
        // membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root", "ikan0710"
        );
        
        // kerjakan mysql query
        String query = "INSERT INTO person (name) VALUES ('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        
        // tutup koneksi database
        con.close();
    }
}