package TPMODUL1_KEIKO;

public class penumpang {
    private String NIK;
    private String namadpn;
    private String namablkng;

    public penumpang(String NIK, String namadpn, String namablkng) {
        this.NIK = NIK;
        this.namadpn = namadpn;
        this.namablkng = namablkng;
    }
    
    public void tampildaftarpenumpang() {
        System.out.println("Nomor Induk Kependudukan: " + NIK);
        System.out.println("Nama Depan: " + namadpn);
        System.out.println("Nama Belakang: " + namablkng);
    }
}
