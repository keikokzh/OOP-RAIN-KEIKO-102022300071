class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    int jumlahKomputer;
    String namaWarnet;
    float hargaPerjam;

    // To do: Buatlah constructor pada class Komputer
    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerjam){
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerjam = hargaPerjam;
    }
    
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    public void Informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Nama Warnet: " + namaWarnet + "\nJumlah Komputer: " + jumlahKomputer + "\nHarga Perjam: " + hargaPerjam);
    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

}