/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi program utama untuk mengelola data mahasiswa, mata kuliah, dosen, dan kendaraan
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 5 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("019", "Nadia Azura N", "Informatika");
        Dosen D1 = new Dosen("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("123", "Honda");

        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());
        
    }
}