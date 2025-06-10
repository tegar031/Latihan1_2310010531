
package latihan3;

public class Rumus {
    //Nama : M.Tegar Adhitya Qur'ani
    //NPM : 2310010531
    //Kelas : REG 4A Pagi BJM
    
    //Membuat Atribut
    public int sisi;
    public int panjang;
    public int lebar;
    public int hasil;
    
     // Konstruktor: set semua atribut ke 0
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    
    }
    // Method untuk menghitung luas persegi
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }

    // Method untuk menghitung luas persegi panjang
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }
    
     // Accessor untuk mengembalikan nilai hasil
    public int getHasil() {
        return hasil;
    }
}
