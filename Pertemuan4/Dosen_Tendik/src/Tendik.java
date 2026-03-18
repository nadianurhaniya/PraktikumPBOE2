/* Nama File    : Tendik.java
 * Deskripsi    : Berisi atribut dan method dalam class Tendik
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 12 Maret 2026
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;
    private static int counterTendik = 0;

    //konstruktor tanpa parameter
    public Tendik() {
        super();
        this.bidang = "";
        counterTendik++;
    }

    //konstruktor dengan parameter
    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                 double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        counterTendik++;
    }

    //selektor
    public String getBidang() { 
        return bidang; 
    }

    //mutator
    public void setBidang(String bidang) { 
        this.bidang = bidang; 
    }

    //method
    @Override
    public double hitungTunjangan() {
        Period masaKerja = Period.between(getTmt(), LocalDate.now());
        return 0.01 * masaKerja.getYears() * getGajiPokok();
    }

    private LocalDate hitungBUP() {
        return getTanggalLahir().plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("Jenis: Tenaga Kependidikan");
        System.out.println("Bidang: " + bidang);
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", hitungTunjangan()));
        System.out.println("BUP: " + hitungBUP().format(formatter));
    }

    public static void printCounterTendik(){
        System.out.println("Jumlah Tendik:" + counterTendik);
    }
}