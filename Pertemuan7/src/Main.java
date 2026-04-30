/* Nama File   : Main.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

public class Main {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Gojo", "D001");
        Dosen d2 = new Dosen("Bu Nobara", "D002");

        Mahasiswa2 m1 = new Mahasiswa2("Lia", "M001", d1);
        Mahasiswa2 m2 = new Mahasiswa2("Bariq", "M002", d1);
        Mahasiswa2 m3 = new Mahasiswa2("Keshi", "M003", d2);
        Mahasiswa2 m4 = new Mahasiswa2("Yuta", "M004", d2);
        Mahasiswa2 m5 = new Mahasiswa2("Tanjiro", "M005", d1);

        Seminar s = new Seminar();

        s.registrasi(d1);
        s.registrasi(d2);
        s.registrasi(m1);
        s.registrasi(m2);
        s.registrasi(m3);
        s.registrasi(m4);
        s.registrasi(m5);
        System.out.println("==== Jumlah dan Detail Peserta ====");
        System.out.println(s.countPeserta());

        s.tampilPeserta();

        System.out.println("==== Jumlah Peserta Mahasiswa ====");
        System.out.println(s.countMahasiswa());

        m1.setWali(d2);

        System.out.println("==== Detail Mahasiswa ====");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
        m4.tampilDataMahasiswa();
        m5.tampilDataMahasiswa();
    }
}