package hitung;

public class Matematika {
    //Membuat variabel
    private double bil1, bil2;
    
    //Membuat Constructor
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    //Membuat method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
}
