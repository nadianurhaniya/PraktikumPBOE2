package Piaraan;

// Nama File    : MPiaraan.java
// NIM          : 24060124120019
// Nama         : Nadia Azura Nurhaniya 
// Tanggal      : 12 Mei 2026

public class MPiaraan {
    public static void main(String[] args) {

        // Membuat objek Piaraan
        Piaraan daftarPiaraan = new Piaraan();

        // Menambahkan anabul ke antrean
        daftarPiaraan.enqueueAnabul(new Anjing("Odie"));
        daftarPiaraan.enqueueAnabul(new Kucing("Moza", 2.8));
        daftarPiaraan.enqueueAnabul(new Burung("Moly"));
        daftarPiaraan.enqueueAnabul(new Anggora("Milky", 4.5));
        daftarPiaraan.enqueueAnabul(new KembangTelon("Chiko", 5.2));

        // Menampilkan seluruh anabul
        System.out.println("===== DAFTAR PIARAAN =====");
        daftarPiaraan.showAnabul();

        // Menampilkan jenis tiap anabul
        System.out.println("\n===== JENIS PIARAAN =====");
        daftarPiaraan.showJenisAnabul();

        // Menampilkan jumlah data
        System.out.println("\nJumlah piaraan : " + daftarPiaraan.getNbelm());

        // Mengecek apakah ada anggota tertentu
        System.out.println("\nCek member:");
        System.out.println("Apakah Ciky ada? " + daftarPiaraan.isMember(new Kucing("Ciky", 3.0)));

        // Menampilkan anabul paling depan
        System.out.println("\nPiaraan paling depan:");
        System.out.println(daftarPiaraan.getAnabul().getNama());

        // Menghapus anabul depan
        System.out.println("\nMenghapus piaraan depan...");
        Anabul hapus = daftarPiaraan.dequeueAnabul();
        System.out.println("Piaraan yang keluar: " + hapus.getNama());

        // Menampilkan isi setelah dequeue
        System.out.println("\n===== DATA SETELAH DEQUEUE =====");
        daftarPiaraan.showAnabul();

        // Statistik kucing
        System.out.println("\n===== STATISTIK KUCING =====");
        System.out.println("Jumlah kucing : " + daftarPiaraan.countKucing());
        System.out.println("Total bobot kucing : " + daftarPiaraan.bobotKucing() + " kg");
    }
}