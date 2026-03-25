/* Nama File   : Pengusaha.java
 * Deskripsi   : berisi atribut, method, konstruktor dari class Pengusaha
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 25 Maret 2026
 */

import java.util.Date;
import java.util.Calendar;
 
public class Pengusaha extends Manusia implements Pajak {
    // Attribut
    private String npwp;
    private static int counterPengusaha = 0;
    private static final int B = 2; // Digit ke-13 NIM 

    // Konstruktor tanpa parameter
    public Pengusaha() {
        super(); 
        this.npwp = "00.000.000.0-000.000";
        counterPengusaha++;
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
 
    // Selektor
    public String getNpwp() {
        return npwp;
    }
 

    // Mutator
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
 
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
 
    @Override
    public int hitungMasaKerja() {
        Calendar now = Calendar.getInstance();
        Calendar tglMulai = Calendar.getInstance();
        tglMulai.setTime(tgl_mulai_kerja);
         
        int tahun = now.get(Calendar.YEAR) - tglMulai.get(Calendar.YEAR);
        if (now.get(Calendar.MONTH) < tglMulai.get(Calendar.MONTH)) {
            tahun--;
        } else if (now.get(Calendar.MONTH) == tglMulai.get(Calendar.MONTH)) {
            if (now.get(Calendar.DATE) < tglMulai.get(Calendar.DATE)) {
                tahun--;
            }
        }
         
        return tahun + B;
    }
 
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }
 
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}