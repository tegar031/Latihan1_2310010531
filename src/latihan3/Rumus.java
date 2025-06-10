
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
    
}
