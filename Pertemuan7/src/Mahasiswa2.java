/* Nama File   : Mahasiswa2.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

class Mahasiswa2 extends CivitasakAdemika {
    String NIM;
    Dosen dosenWali;

    Mahasiswa2(String nama, String NIM, Dosen dosenWali) {
        super(nama);
        this.NIM = NIM;
        this.dosenWali = dosenWali;
    }

    String getNomor() {
        return NIM;
    }

    void setWali(Dosen d) {
        this.dosenWali = d;
    }

    void tampilDataMahasiswa() {
        System.out.println(NIM + " " + nama + " " + dosenWali.nama);
    }
}