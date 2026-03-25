/* Nama File   : Petani.java
 * Deskripsi   : berisi atribut, method, konstruktor dari class Petani
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 25 Maret 2026
 */

import java.util.Date;
import java.util.Calendar;

public class Petani extends Manusia implements Pajak {
    // Atribut
    private String asal_kota;
    private static int counterPetani = 0;
    private static final int C = 0; // Digit ke-12 NIM 

    // Konstruktor tanpa parameter
    public Petani() {
        super(); 
        this.asal_kota = "Unknown";
        counterPetani++;
    }

    // Konstruktor dengan parameter
    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor
    public String getAsal_kota() {
        return asal_kota;
    }

    // Mutator
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
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
        
        return tahun + C;
    }

    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + asal_kota);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}