/* Nama File    : Data.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public class Data<T> {
    // atribut
    protected T[] ruang;

    private int banyak;

    // method
    // konstruktor tanpa parameter
    public Data() {
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    // getter getIsi dgn parameter
    public T getIsi(int posisi) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Parameter harus dalam rentang 1..100.");
        }
        return ruang[posisi - 1];
    }

    // setter setIsi
    public void setIsi(int posisi, T obj) {
        if (posisi < 1 || posisi > 100) {
            throw new IllegalArgumentException("Parameter harus daam rentang 1..100");
        }
        if (this.ruang[posisi - 1] == null) {
            this.banyak++;
        }
        this.ruang[posisi - 1] = obj;
    }

    // getter getSize
    public int getSize() {
        return this.banyak;
    }
    
}