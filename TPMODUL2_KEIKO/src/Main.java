public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Keiko", 19, "Mainecoon");
        Burung burung = new Burung("Azma", 21, "Putih");

        System.out.println("Detail Hewan\n");

        System.out.println("ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan koi tetangga");
        
        System.out.println();

        System.out.println("ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("siomay bandung");

        System.out.println();

        kucing.infoHewan();
        burung.infoHewan();
    }

}
