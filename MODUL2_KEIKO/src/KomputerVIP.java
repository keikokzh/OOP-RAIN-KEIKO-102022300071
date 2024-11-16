class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerjam, boolean vipCard){
        super(jumlahKomputer, namaWarnet, hargaPerjam);
        this.vipCard = vipCard;
    }
    
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void Informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Nama Warnet: " + namaWarnet + "\nJumlah Komputer: " + jumlahKomputer + "\nHarga Perjam: " + hargaPerjam);
        if (vipCard){
            System.out.println("Status: VIP");
            System.out.println("Benefit: Diskon, Poin, Booking");}
            else{System.out.println("Status: Non VIP");
            System.out.println("Benefit: Tidak ada nyehehehe");}
    }
    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void Login(String username){
        System.out.println("Login dengan username: " + username);
    }
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void Bermain(int jam){
        System.out.println("Bermain selama " + jam + " jam");
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void Bermain(int jam, int menitTambahan){
        System.out.println("nambah billing selama " + jam + " jam, dengan tambahan " + menitTambahan + " jam");
    }


}