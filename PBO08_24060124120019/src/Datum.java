/* Nama File    : Datum.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public class Datum<T> {
    // atribut
    private T isi;

    // method
    //setter setIsi
    public void setIsi(T isibaru){
        this.isi=isibaru;
    }
    //getter getIsi
    public T getIsi(){
        return this.isi;
    }
}