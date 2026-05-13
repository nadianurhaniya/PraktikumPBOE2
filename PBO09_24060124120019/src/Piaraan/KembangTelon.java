package Piaraan;

/* Nama File    : KembangTelon.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public class KembangTelon extends Kucing {
    // atribut 

    // method
    // konstruktor dgn parameter
    public KembangTelon (String nama, double bobot) {
        super(nama,bobot);
    }

    //berat dalam kilogram
    @Override
    public String toString() {
        return "KembangTelon: " + this.getNama() + " (" + this.getBobot() + " kg)";
    }
} 