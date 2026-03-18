/* Nama File    : DosenTamu.java
 * Deskripsi    : Berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 12 Maret 2026
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;
    private static int counterDtu = 0;

    //konstruktor tanpa parameter
    public DosenTamu() {
        super();
        this.nidk = "";
        this.tanggalBerakhirKontrak = LocalDate.now();
        counterDtu++;
    }

    //konstruktor dengan parameter
    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt,
                    double gajiPokok, String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
        counterDtu++;
    }

    //selektor
    public String getNidk() { 
        return nidk; 
    }

    public LocalDate getTanggalBerakhirKontrak() { 
        return tanggalBerakhirKontrak; 
    }

    //mutator
    public void setNidk(String nidk) { 
        this.nidk = nidk; 
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) { 
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak; 
    }

    //method
    @Override
    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    private String hitungSisaKontrak() {
        Period period = Period.between(LocalDate.now(), tanggalBerakhirKontrak);
        return period.getMonths() + " bulan " + period.getDays() + " hari";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("Jenis: Dosen Tamu");
        System.out.println("NIDK: " + nidk);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Tunjangan: Rp" + String.format("%,.2f", hitungTunjangan()));
        System.out.println("Berakhir Kontrak: " + tanggalBerakhirKontrak.format(formatter));
        System.out.println("Sisa Kontrak: " + hitungSisaKontrak());
    }

    public static void printCounterDtu(){
        System.out.println("Jumlah Dosen Tamu:"+ counterDtu);
    }
}