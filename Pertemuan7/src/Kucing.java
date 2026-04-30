/* Nama File   : Kucing.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

class Kucing extends Anabul {
    Kucing(String nama) {
        super(nama);
    }

    void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}