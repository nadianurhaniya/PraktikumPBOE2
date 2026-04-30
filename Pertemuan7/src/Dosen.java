/* Nama File   : Dosen.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

class Dosen extends CivitasakAdemika {
    String NIP;

    Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    String getNomor() {
        return NIP;
    }
}