// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;

    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;
    }

    // Todo : Create Getter and Setter
    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public int jumlah() {
        return jumlah;
    }

    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double harga() {
        return harga;
    }

    public void setharga(double harga) {
        this.harga = harga;
    }

    public String brand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    // Todo : Create Method ShowData
    public void TampilkanDataMakananBasah() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Brand: " + brand);
    } 

}
