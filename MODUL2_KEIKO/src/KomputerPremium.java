import javax.sound.midi.SysexMessage;

class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.ruangPrivat = ruangPrivat;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Nama Warnet: " + namaWarnet + "\nJumlah Komputer: " + jumlahKomputer + "\nHarga Perjam: " + hargaPerjam);
        if (ruangPrivat){
            System.out.println("Status Ruangan: Premium");
            System.out.println("Fasilitas Ruang Premium: AC, Wifi kencang");}
            else{System.out.println("Status Ruangan: Standar");
            System.out.println("Fasilitas Ruang Standar: NO AC, Wifi slow");
    
        }
    }
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer){
        System.out.println("Memesan komputer nomor: " + nomorKomputer);
    }
    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan: " + makanan);
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan: " + makanan + "dan minuman: " + minuman);
    }
    
}
