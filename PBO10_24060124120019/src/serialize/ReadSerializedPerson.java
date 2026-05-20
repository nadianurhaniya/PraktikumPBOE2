package serialize;
/*
 * File     : ReadSerializedPerson.java
 * Deskripsi: Program untuk membaca objek Person yang terserialisasi
 * Pembuat  : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal  : 20 Mei 2026
 * 
 */
import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}