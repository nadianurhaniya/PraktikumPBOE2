/* Nama File    : MGaris.java
 * Deskripsi    : Main class untuk menjalankan class Garis
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 26 Februari 2026
 */

public class MGaris {
    public static void main(String[] args) {

        System.out.println("Jumlah Garis awal : " + Garis.getCounterGaris());

        // Membuat titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);

        // Membuat garis G1
        Garis G1 = new Garis(t1, t2);

        System.out.println("\n=== Garis G1 ===");
        G1.printGaris();
        System.out.println("Panjang Garis    : " + G1.getPanjang());
        System.out.println("Gradien Garis    : " + G1.getGradien());
        System.out.println("Titik Tengah     : ");
        G1.getTitikTengah().printTitik();
        System.out.println("Persamaan Garis  : " + G1.getPersamaanGaris());

        // Membuat garis lain untuk pengujian
        Titik t3 = new Titik(1, 2);
        Titik t4 = new Titik(3, 6);
        Garis G2 = new Garis(t3, t4);

        System.out.println("\n=== Garis G2 ===");
        G2.printGaris();
        System.out.println("Panjang Garis    : " + G2.getPanjang());
        System.out.println("Gradien Garis    : " + G2.getGradien());
        System.out.println("Persamaan Garis  : " + G2.getPersamaanGaris());

        // Cek sejajar
        System.out.println("\nApakah G1 sejajar G2? " + G1.isSejajar(G2));

        // Cek tegak lurus
        System.out.println("Apakah G1 tegak lurus G2? " + G1.isTegakLurus(G2));

        System.out.println("\nJumlah Garis akhir : " + Garis.getCounterGaris());
    }
}