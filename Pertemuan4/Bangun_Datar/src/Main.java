/* Nama File    : Main.java
 * Deskripsi    : berisi program utama untuk menguji class BangunDatar, Persegi, dan Lingkaran
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 12 Maret 2026
 */

public class Main {
    public static void main(String[] args)
    {
        // Demo Persegi
        Persegi p = new Persegi(5, "Merah", "Hitam");
        System.out.println("\n--- PERSEGI ---");
        p.printInfo();
        System.out.println("Diagonal: " + p.getDiagonal());

        // Demo Lingkaran
        Lingkaran l = new Lingkaran(10, "Biru", "Putih");
        System.out.println("\n--- LINGKARAN ---");
        l.printInfo();

        // Counter
        System.out.println("\n========================================");
        BangunDatar.printCounterBangunDatar();
        System.out.println("========================================");
    }
}