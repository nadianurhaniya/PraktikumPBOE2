/* Nama File    : MataKuliah.java
 * Deskripsi    : Berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 5 Maret 2026
 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int SKS;

    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.SKS = 0;
    }

    MataKuliah(String idMatKul, String nama, int SKS) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.SKS = SKS;
    }

    String getidMatKulMataKuliah() {
        return this.idMatKul;
    }

    String getNamaMataKuliah() {
        return this.nama;
    }

    int getSKSMahasiswa() {
        return this.SKS;
    }

    public void setidMatKulMataKuliah(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    public void setNamaMataKuliah(String nama) {
        this.nama = nama;
    }
    
    public void setSKSMahasiswa(int SKS) {
        this.SKS = SKS;
    }
}