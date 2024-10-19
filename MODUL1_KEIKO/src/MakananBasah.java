// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;

    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
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

    public String bahan() {
        return bahan;
    }

    public void setbahan(String bahan) {
        this.bahan = bahan;
    }

    // Todo : Create Method ShowData
    public void TampilkanData() {
        System.out.println("Nama Makanan: " + nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
        System.out.println("Bahan: " + bahan);
    } 

}
