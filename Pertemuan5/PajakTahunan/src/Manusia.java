/* Nama File   : Manusia.java
 * Deskripsi   : berisi atribut, method, konstruktor dari class Manusia
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 25 Maret 2026
 */

import java.util.Date;

 public abstract class Manusia {
    // Attribut
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // Konstruktor tanpa parameter
    public Manusia() {
        this.nama = "Unknown";
        this.tgl_mulai_kerja = new Date(); // Tanggal sekarang
        this.alamat = "Unknown";
        this.pendapatan = 0;
        counterMns++;
    }
    
    // Konstruktor dengan paramater
    public Manusia(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selector
    public String getNama() {
        return nama;
    }

    public Date getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }

    public String getAlamat() {
        return alamat;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTgl_mulai_kerja(Date tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // Abstract method
    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
} 