/* Nama File    : Kendaraan.java
 * Deskripsi    : Berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 5 Maret 2026
 */

public class Kendaraan {
    private String noPlat;
    private String jenis;

    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    String getnoPlatKendaraan() {
        return this.noPlat;
    }

    String getJenisKendaraan() {
        return this.jenis;
    }

    public void setnoPlatKendaraan(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenisKendaraan(String jenis) {
        this.jenis = jenis;
    }

}