/* Nama File    : Lingkaran.java
 * Deskripsi    : Berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 12 Maret 2026
 */

public class Lingkaran extends BangunDatar
{
    private double jari;

    public Lingkaran()
    {
        super();
        setJmlSisi(0); // Lingkaran direpresentasikan memiliki 0 sisi lurus
    }

    public Lingkaran(double diameter, String warna, String border)
    {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari()
    {
        return jari;
    }

    public void setJari(double jari)
    {
        this.jari = jari;
    }

    public double getLuas()
    {
        return Math.PI * jari * jari;
    }

    public double getKeliling()
    {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}