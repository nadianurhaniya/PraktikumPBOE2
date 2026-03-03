/* Nama File    : Titik.Java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Nadia Azura Nurhaniya - 24060124120019
 * Tanggal      : 27 Februari 2026
 */

public class Titik {

    /*************** ATRIBUT ***************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*************** METHOD ***************/

    //konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    
    //mengembalikan nilai counterTitik
    static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser titik sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    int getKuadran(){
        if(absis > 0 && ordinat > 0){
            return 1;
        } else if(absis < 0 && ordinat > 0){
            return 2;
        } else if(absis < 0 && ordinat < 0){
            return 3;
        } else if(absis > 0 && ordinat < 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat(){
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    double getJarak(Titik T){
        return Math.sqrt(Math.pow(absis - T.getAbsis(), 2) + Math.pow(ordinat - T.getOrdinat(), 2));
    }

    void refleksiX(){
        ordinat *= -1;
    }

    void refleksiY(){
        absis *= -1;
    }

    Titik getRefleksiX(){
        return new Titik(absis, ordinat * -1);
    }

    Titik getRefleksiY(){
        return new Titik(absis * -1, ordinat);
    }
} 