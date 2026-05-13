package Piaraan;

/* Nama File    : Anggora.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */


public class Anggora extends Kucing{
    // atribut

    // method
    // konstruktor dengan parameter
    public Anggora (String nama, double bobot) {
        super(nama,bobot);
    }

    // berat dalam kilogram 
    public String toString() {
        return "Anggora: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
}