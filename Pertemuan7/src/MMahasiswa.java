/* Nama File   : MMahasiswa.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        // 2c. Aplikasi Konstruktor Tanpa Parameter
        Mahasiswa m1 = new Mahasiswa();
        System.out.print("M1 (Default): ");
        m1.tampilData();

        // 2d. Aplikasi Konstruktor 3 Parameter
        Mahasiswa m2 = new Mahasiswa("124120019", "Jura", "Informatika");
        System.out.print("M2 (Input): ");
        m2.tampilData();

        // 2e. Aplikasi Konstruktor Kloning
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.print("M3 (Kloning M2): ");
        m3.tampilData();

        System.out.println("--- Testing Overloading setProgramStudi ---");

        // Overloading Varian 1: Tanpa Parameter
        m1.setProgramStudi(); 
        System.out.print("M1 setelah setProgramStudi(): ");
        m1.tampilData();

        // Overloading Varian 2: Parameter String
        m1.setProgramStudi("Sistem Informasi");
        System.out.print("M1 setelah setProgramStudi(String): ");
        m1.tampilData();

        // Overloading Varian 3: Parameter Objek Mahasiswa
        m1.setProgramStudi(m2);
        System.out.print("M1 setelah setProgramStudi(m2): ");
        m1.tampilData();
    }
}