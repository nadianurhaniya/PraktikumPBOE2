// Nama File    : MTeman.java
// NIM          : 24060124120019
// Nama         : Nadia Azura Nurhaniya
// Tanggal      : 12 Mei 2026

public class MTeman {
    public static void main(String[] args) {

        // Membuat objek Teman
        Teman t = new Teman();

        // Menambahkan nama teman
        t.addNama("Kageyama");
        t.addNama("Gojo");
        t.addNama("Nobara");
        t.addNama("Itadori");
        t.addNama("Hinata");

        // Menampilkan daftar teman
        System.out.println("===== DAFTAR TEMAN =====");
        t.showTeman();

        // Menampilkan jumlah teman
        System.out.println("\nJumlah teman : " + t.getNbelm());

        // Mengambil nama berdasarkan indeks
        System.out.println("Nama pada indeks ke-2 : " + t.getNama(2));

        // Mengecek member
        System.out.println("Apakah Gojo ada? " + t.isMember("Gojo"));
        System.out.println("Apakah Itadori ada? " + t.isMember("Itadori"));

        // Menghitung jumlah nama tertentu
        System.out.println("Jumlah nama Nobara : " + t.countNama("Nobara"));

        // Mengubah nama berdasarkan indeks
        t.setNama(1, "Sugawara");

        // Mengganti nama tertentu
        t.gantiNama("Hinata", "Nanami");

        // Menampilkan setelah perubahan
        System.out.println("\n===== SETELAH DIUBAH =====");
        t.showTeman();

        // Menghapus nama
        t.delNama("Nobara");

        // Menampilkan setelah penghapusan
        System.out.println("\n===== SETELAH HAPUS Nobara =====");
        t.showTeman();

        // Menampilkan jumlah akhir
        System.out.println("\nJumlah teman sekarang : " + t.getNbelm());
    }
}