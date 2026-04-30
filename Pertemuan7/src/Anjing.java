/* Nama File   : Anjing.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

class Anjing extends Anabul {
    Anjing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}