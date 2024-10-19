// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    public static void main(String[] args) {
        ArrayList<String> daftarMakananKering = new ArrayList<>();
        ArrayList<String> daftarMakananBasah = new ArrayList<>();

    }

    public void tambahMakananKering() {
        Scanner input = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukkan Nama Makanan: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Jumlah Makanan: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan Harga Makanan: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan Brand Makanan: ");
        String brand = input.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering Makanan = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add (Makanan);
        
        
        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        
    }

    public void tambahMakananBasah() {
        Scanner input = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukkan Nama Makanan: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Jumlah Makanan: ");
        int jumlah = input.nextInt();

        System.out.print("Masukkan Harga Makanan: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan Bahan Makanan: ");
        String bahan = input.nextLine();
        // Todo : Create a new object for MakananBasah
        MakananBasah Makanan = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(Makanan);
        
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
        } else {
            // Todo : Create print notification for Makanan Kering  
            for 
            }
            // Todo : Create print notification for  Makanan Basah
            for 
            }
        }
    }
}
