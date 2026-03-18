/* Nama File    : Tendik.java
 * Deskripsi    : Kelas utama untuk menjalankan program dan menguji kelas-kelas yang telah dibuat
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap();
        dt.setNip("1989562871");
        dt.setNama("Satoru Gojo");
        dt.setTanggalLahir(LocalDate.of(1989, 12, 7));
        dt.setTmt(LocalDate.of(2017, 7, 5));
        dt.setGajiPokok(20_000_000);
        dt.setFakultas("Teknik Informatika");
        dt.setNidn("1990726457");

        DosenTamu dtu = new DosenTamu(
            "200287461",
            "Fushiguro Megumi", 
            LocalDate.of(2002, 12, 22),
            LocalDate.of(2022, 10, 3),
            10_000_000,
            "Teknik Mesin",
            "DT987654",
            LocalDate.of(2025, 12, 31)
        );

        Tendik t = new Tendik();
        t.setNip("20029347338");
        t.setNama("Itadori Yuji");
        t.setTanggalLahir(LocalDate.of(2002, 3, 20));
        t.setTmt(LocalDate.of(2023, 9, 15));
        t.setGajiPokok(7_500_000);
        t.setBidang("Akademik");

        // Test output
        System.out.println("======Informasi Dosen Tetap======");
        dt.printInfo();
        System.out.println("======Informasi Dosen Tamu======");
        dtu.printInfo();
        System.out.println("======Informasi Tendik======");
        t.printInfo();

        //
        System.out.println("======Informasi Jumlah Pegawai======");
        Pegawai.printCounterPegawai();
        Dosen.printCounterDosen();
        DosenTetap.printCounterDt();
        DosenTamu.printCounterDtu();
        Tendik.printCounterTendik();
    }
}