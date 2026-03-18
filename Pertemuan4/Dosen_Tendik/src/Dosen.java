/* Nama File    : Dosen.java
 * Deskripsi    : Berisi atribut dan method dalam class Dosen
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 12 Maret 2026
 */

import java.time.*;

public class Dosen extends Pegawai {
    protected String fakultas;
    private static int counterDosen = 0;

    //konstruktor tanpa parameter
    public Dosen() {
        super();
        this.fakultas = "";
        counterDosen++;
    }

    //konstruktor dengan parameter
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, 
                double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
        counterDosen++;
    }

    //selektor
    public String getFakultas() { 
        return fakultas; 
    }

    //mutator
    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }

    //method
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Fakultas: "+ fakultas);
    }

    public static void printCounterDosen(){
        System.out.println("Jumlah Dosen: " + counterDosen);
    }
}