/* Nama File    : IResize.java
 * Deskripsi    : Interface untuk objek yang bisa di-resize
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 18 Maret 2026
 */

public interface IResize {
    //menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //mengskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
    
} 