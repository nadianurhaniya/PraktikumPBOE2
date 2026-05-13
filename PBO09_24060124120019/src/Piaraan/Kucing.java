package Piaraan;

/* Nama File    : Kucing.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public class Kucing extends Anabul {
    // atribut 
    protected double bobot;

    // method
    // konstruktor dengan parameter
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot=bobot;
    }

    // getter bobot
    public double getBobot() {
        return bobot;
    }

    // cara gerak kucing
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    // suara kucing
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}
