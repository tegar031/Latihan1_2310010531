
package latihan3;


public class RumusBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class Rumus dengan nama panggilan (misalnya: udin)
        Rumus Tegar = new Rumus();

        // Mengisi nilai sisi dan menghitung luas persegi
        Tegar.sisi = 5;
        Tegar.hitungLuasPersegi();
        System.out.println("Hasil Luas Persegi: " + Tegar.getHasil());

        // Mengisi nilai panjang dan lebar, lalu menghitung luas persegi panjang
        Tegar.panjang = 7;
        Tegar.lebar = 4;
        Tegar.hitungLuasPersegiPanjang();
        System.out.println("Hasil Luas Persegi Panjang: " + Tegar.getHasil());
    
    }
}
