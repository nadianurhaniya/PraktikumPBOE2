/* Nama File    : MTitik.java
 * Deskripsi    : berisi program utama untuk menguji class Titik
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 27 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        System.out.println("Jumlah objek Titik awal : " + Titik.getCounterTitik());

        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik();
        System.out.println("Jumlah objek Titik setelah membuat T1 : " + Titik.getCounterTitik());

        T1.setAbsis(3);      // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);    // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();     // mencetak koordinat T1

        System.out.println("Kuadran T1 : " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat : " + T1.getJarakPusat());

        T1.geser(3,4);       // menggeser T1 sejauh (3,4)
        T1.printTitik();     // menampilkan koordinat setelah digeser

        // Membuat objek T2 sebagai referensi dari T1
        Titik T2 = T1;
        System.out.println("\nT2 adalah referensi dari T1");
        T2.printTitik();
        

        // Mengubah T1
        T1.setAbsis(10);
        T1.setOrdinat(10);

        System.out.println("Setelah T1 diubah:");
        System.out.print("T1 : ");
        T1.printTitik();
        System.out.print("T2 : ");
        T2.printTitik(); 

        // Membuat objek T3 baru
        Titik T3 = new Titik(2, -5);
        System.out.println("\nMembuat T3 (2,-5)");
        T3.printTitik();
        System.out.println("Kuadran T3 : " + T3.getKuadran());

        // Menghitung jarak antar titik
        System.out.println("\nJarak T1 ke T2: " + T1.getJarak(T2));
        System.out.println("Jarak T1 ke T3 : " + T1.getJarak(T3));
    

        // Refleksi
        System.out.println("\nT1 Sebelum direfleksi");
        T1.printTitik();
        T1.refleksiX();
        System.out.println("Titik T1 setelah direfleksikan terhadap sumbu X:");
        T1.printTitik();

        System.out.println("\nT2 Sebelum direfleksi");
        T2.printTitik();
        T2.refleksiY();
        System.out.println("Titik T2 setelah direfleksikan terhadap sumbu Y:");
        T2.printTitik();
        
        System.out.println("\nRefleksi T3 terhadap sumbu X:");
        Titik T4 = T3.getRefleksiX();
        T4.printTitik();

        System.out.println("Refleksi T3 terhadap sumbu Y:");
        Titik T5 = T3.getRefleksiY();
        T5.printTitik();

        System.out.println("\nJumlah objek Titik akhir : " + Titik.getCounterTitik());
    }
}