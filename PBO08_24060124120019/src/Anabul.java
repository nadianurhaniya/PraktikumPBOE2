/* Nama File    : Anabul.java
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public abstract class Anabul {
    // atribut
    protected String nama;

    // method
    // konstruktor dengan parameter
    public Anabul(String nama) {
        this.nama = nama;
    }

    // getter nama
    public String getNama() { 
        return this.nama; 
    }

    // setter nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // cara hewan bergerak (abstract)
    public abstract void gerak();

    // suara hewan (abstract)
    public abstract void bersuara();
}