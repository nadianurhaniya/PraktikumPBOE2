/* Nama File   : PNS.java
 * Deskripsi   : berisi atribut, method, konstruktor dari class PNS
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 25 Maret 2026
 */

import java.util.Date;
import java.util.Calendar;
 
public class PNS extends Manusia implements Pajak {
    // Attribut
    private String nip;
    private static int counterPNS = 0;
    private static final int A = 4; // Digit ke-14 NIM

    // Konstruktor tanpa parameter
    public PNS() {
        super(); 
        this.nip = "000000000000000000";
        counterPNS++;
    }

    // Konstruktor dengan parameter
    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Selektor
    public String getNip() {
        return nip;
    }

    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
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
        
        return tahun + A;
    }

    @Override
    public double hitungPajak() {
        return 0.1 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak: " + hitungPajak());
    }
}