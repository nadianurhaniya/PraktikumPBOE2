/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas dengan prosedur dan fungsi generik
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 3 Mei 2026
 */

public class OperatorGenerik {
    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public static <T extends Kucing> double Bobot2(T a, T b) {
        return a.getBobot() + b.getBobot();
    }
}