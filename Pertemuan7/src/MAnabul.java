/* Nama File   : MAnabul.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul k = new Kucing("Catty");
        Anabul a = new Anjing("Milky");
        Anabul b = new Burung("Odie");

        k.gerak();
        k.bersuara();

        a.gerak();
        a.bersuara();

        b.gerak();
        b.bersuara();
    }
}