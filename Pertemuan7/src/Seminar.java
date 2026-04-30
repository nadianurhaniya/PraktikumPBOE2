/* Nama File   : Seminar.java
 * Pembuat     : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal     : 29 April 2026
 */

class Seminar {
    CivitasakAdemika[] pesertas = new CivitasakAdemika[100];
    int banyakPeserta;

    Seminar() {
        banyakPeserta = 0;
    }

    void registrasi(CivitasakAdemika c) {
        if (banyakPeserta < 100) {
            pesertas[banyakPeserta] = c;
            banyakPeserta++;
        }
    }

    int countPeserta() {
        return banyakPeserta;
    }

    void tampilPeserta() {
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " " + pesertas[i].nama);
        }
    }

    int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
}