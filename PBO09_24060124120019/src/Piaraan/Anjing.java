package Piaraan;

/* Nama File    : Anjing.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

// 3. Realisasi subkelas Anjing
public class Anjing extends Anabul {
    // atribut

    // method
    // konstruktor dengan parameter
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}
