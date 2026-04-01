/* Nama File : Asersi1.java
 * Deskripsi : Program penggunaan exception buatan sendiri
                Pengenalan klause 'throw' dan 'throws'
 * Pembuat   : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal   : 26 maret 2026
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 15) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(20);
            as.cobaAngka(14);
            as.cobaAngka(9);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}