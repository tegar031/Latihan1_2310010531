package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Matematika tegar = new Matematika(3,1);
        
        System.out.println("Hasil Penjumlahan: "+tegar.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+tegar.setPengurangan());
        System.out.println("Hasil Perkalian: "+tegar.setPerkalian());
        System.out.println("Hasil Pembagian: "+tegar.setPembagian());
    }
}
