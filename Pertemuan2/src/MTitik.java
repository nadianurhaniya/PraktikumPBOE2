/* Nama File    : MTitik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3);  //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);  //mengubah ordinat T1 dengan nilai 4
        T1.printTitik();  //mencetak koordinat T1 ke layar
        T1.geser(3,4);   //menggeser T1 sejauh (3,4)
        T1.printTitik();  //menampilkan koordinat T1 setelah di geser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
    }
}