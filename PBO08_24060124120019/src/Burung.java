/* Nama File    : Burung.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public class Burung extends Anabul {
    // atribut 

    // method
    // konstruktor dengan parameter
    public Burung(String nama) {
        super(nama);
    }

    // cara gerak burung
    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    // suara burung
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}