/* Nama File   : MManusia.java
 * Deskripsi   : berisi driver dari class Manusia, PNS, Pengusaha, Petani
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 25 Maret 2026
 */

// package Latihan;
import java.text.ParseException;
import java.text.SimpleDateFormat;
 
public class MManusia {
    public static void main(String[] args) throws ParseException {
        // Format tanggal
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        
        // Membuat objek PNS, Pengusaha, dan Petani
        PNS p1 = new PNS("Satriyo", sdf.parse("01-04-2006"), "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", sdf.parse("01-01-2000"), "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", sdf.parse("09-01-1977"), "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", sdf.parse("01-04-2010"), "Jl. Panorama 111 Tembalang", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");
        
        // Menampilkan beberapa informasi tentang manusia, PNS, Pengusaha, dan Petani
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        
        // Menampilkan informasi lengkap
        System.out.println("=== Detail Informasi ===");
        p1.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();
    }
}