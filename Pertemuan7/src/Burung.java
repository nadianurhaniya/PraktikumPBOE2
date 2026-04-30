/* Nama File   : Burung.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

class Burung extends Anabul {
    Burung(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    void bersuara() {
        System.out.println(nama + " berbunyi cuit");
    }
}