package TPMODUL1_KEIKO;

public class penerbangan {
    
    private String nopenerbangan;
    private String bandaraawal;
    private String bandaratujuan;
    private String waktuberangkat;
    private String waktudatang;
    private float hargatiket;

    public penerbangan(String nopenerbangan, String bandaraawal, String bandaratujuan, String waktuberangkat, String waktudatang, float hargatiket) {
        this.nopenerbangan = nopenerbangan;
        this.bandaraawal = bandaraawal;
        this.bandaratujuan= bandaratujuan;
        this.waktuberangkat = waktuberangkat;
        this.waktudatang = waktudatang;
        this.hargatiket = hargatiket;
    }
    
    public void tampildaftarpenerbangan() {
        System.out.println("Nomor Penerbangan: " + nopenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraawal + "---> Bandara Tujuan: " + bandaratujuan);
        System.out.println("Waktu Keberangkatan: " + waktuberangkat + "---> Waktu Kedatangan: " + waktudatang);
        System.out.println("Harga Tiket: Rp." + hargatiket);
        System.out.println();
    }
}
