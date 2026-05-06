/* Nama File    : Aplikasi.java
 * Deskripsi    : Kelas utama untuk menjalankan semua demonstrasi
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 6 Mei 2026
 */

public class Main {
    public static void main(String[] args) {
        // Kamus Lokal
        Datum<Kucing> d1;
        Datum<Kucing> d2;
        Datum<Anabul> d3;
        Datum<Integer> a, b;
        Datum<String> s1, s2;
        Datum<Anabul> x, y;
        Data<Anabul> kelompokAnabul;
        Data<Kucing> kelompokKucing;

        // Inisialisasi
        d1 = new Datum<>();
        d2 = new Datum<>();
        d3 = new Datum<>();
        a = new Datum<>();
        b = new Datum<>();
        s1 = new Datum<>();
        s2 = new Datum<>();
        x = new Datum<>();
        y = new Datum<>();
        kelompokAnabul = new Data<>();
        kelompokKucing = new Data<>();

        // generik pada class
        System.out.println("\n--- Bagian I: GENERIK PADA CLASS ---");

        d1.setIsi(new Anggora("Odie", 7.3));
        d2.setIsi(new KembangTelon("Moza", 6.7));
        d3.setIsi(new Anjing("Molly"));

        System.out.println(d1.getIsi().toString());
        System.out.println(d2.getIsi().toString());
        System.out.println(d3.getIsi().getNama());

        // Generik pada Operator
        System.out.println("\n--- Bagian II: GENERIK PADA OPERATOR ---");

        // Menukar Integer
        a.setIsi(5);
        b.setIsi(0);
        System.out.println("Integer - Sebelum Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());
        OperatorGenerik.Tukar(a, b);
        System.out.println("Integer - Sesudah Tukar: a=" + a.getIsi() + ", b=" + b.getIsi());

        // Menukan String
        s1.setIsi("Jura");
        s2.setIsi("Nadia");

        System.out.println("String - Sebelum Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("String - Sesudah Tukar: a=" + s1.getIsi() + ", b=" + s2.getIsi());

        // Menukar sesama Kucing
        System.out.println("Kucing - Sebelum Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());
        OperatorGenerik.Tukar(d1, d2);
        System.out.println("Kucing - Sesudah Tukar: a=" + d1.getIsi().getNama() + ", b=" + d2.getIsi().getNama());

        // Menukar sesama Anabul
        x.setIsi(d3.getIsi());
        y.setIsi(d1.getIsi());

        System.out.println("Anabul - Sebelum Tukar: a=" + x.getIsi().getNama() + ", b=" + y.getIsi().getNama());
        OperatorGenerik.Tukar(x, y);
        System.out.println("Anabul - Sesudah Tukar: a=" + x.getIsi().getNama() + ", b=" + y.getIsi().getNama());

        // Bobot dari 2 jenis Kucing
        double totalBobot = OperatorGenerik.Bobot2(
                d1.getIsi(),
                d2.getIsi());
        System.out.println(
                "Total bobot " + d1.getIsi().getNama() + " dan " + d2.getIsi().getNama() + ": " + totalBobot + " kg");

        // Generik pada Data
        System.out.println("\n--- Bagian III: GENERIK PADA DATA ---");

        kelompokAnabul.setIsi(1, d1.getIsi());
        kelompokAnabul.setIsi(2, d2.getIsi());
        kelompokAnabul.setIsi(3, d3.getIsi());

        System.out.println("Isi Data (Anabul) di posisi 1: " + kelompokAnabul.getIsi(1));
        System.out.println("Isi Data (Anabul) di posisi 2: " + kelompokAnabul.getIsi(2));
        System.out.println("Isi Data (Anabul) di posisi 3: " + kelompokAnabul.getIsi(3).getNama());
        System.out.println("Total isi Data: " + kelompokAnabul.getSize());

        kelompokKucing.setIsi(1, d1.getIsi());
        kelompokKucing.setIsi(2, d2.getIsi());

        System.out.println("\nIsi Data (Kucing) di posisi 1: " + kelompokKucing.getIsi(1));
        System.out.println("Isi Data (Kucing) di posisi 2: " + kelompokKucing.getIsi(2));
        System.out.println("Total isi Data: " + kelompokKucing.getSize());

        // Hitung total bobot Data<Kucing>
        double totalBobotKucing = OperatorGenerik.Bobot2(
                kelompokKucing.getIsi(1),
                kelompokKucing.getIsi(2));
        System.out.println("Total bobot kucing di Data: " + totalBobotKucing + " kg");
    }
}

/* KESIMPULAN:
    Generic merupakan konsep yang memungkinkan kita membuat class atau method yang 
lebih fleksibel tanpa harus membuat kode berulang hanya karena tipe datanya berbeda. 
Contohnya pada class Datum<T>, huruf T berfungsi sebagai placeholder untuk tipe data 
yang nantinya ditentukan saat objek dibuat, sehingga bisa digunakan untuk Integer, 
String, Anggota, dan tipe lainnya. Jika menggunakan <T extends Kucing>, maka tipe T 
dibatasi hanya untuk class Kucing atau turunannya. Dengan begitu, method generik dapat 
langsung memakai method khusus milik Kucing, seperti getBobot(). Jadi, generic membantu 
membuat kode lebih reusable, rapi, dan tetap aman terhadap tipe data.
*/