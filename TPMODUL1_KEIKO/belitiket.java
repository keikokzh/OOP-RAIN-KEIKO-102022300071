package TPMODUL1_KEIKO;

import java.util.ArrayList;
import java.util.Scanner;

public class belitiket {
    public static void main(String[] args) {
        ArrayList<penerbangan> daftarpenerbangan = new ArrayList<>();
        daftarpenerbangan.add(new penerbangan("GA101", "CGK", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarpenerbangan.add(new penerbangan("QZ202", "SUB", "KNO, Medan", "09:00", "11:45", 1350000));

        Scanner input = new Scanner(System.in);

        String NIK = null, namadpn = null, namablkng = null;
        penerbangan pnbgnygdipilih = null;
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.println("Silahkan pilih menu: ");
            int pilmenu = input.nextInt();
            input.nextLine();

            if (pilmenu == 1) {
                System.out.println("Daftar Penerbangan yang Tersedia: ");
                for (int i = 0; i < daftarpenerbangan.size(); i++) {
                    System.out.println((i + 1) + ". ");
                    daftarpenerbangan.get(i).tampildaftarpenerbangan();
                }

            } else if (pilmenu == 2) {
                System.out.print("Masukkan NIK: ");
                NIK = input.nextLine();
                System.out.print("Masukkan Nama Depan: ");
                namadpn = input.nextLine();
                System.out.print("Masukkan Nama Belakang: ");
                namablkng = input.nextLine();

                penumpang Penumpang = new penumpang(NIK, namadpn, namablkng);

                System.out.println("Silakan Pilih Tiket Penerbangan: ");
                for (int i = 0; i < daftarpenerbangan.size(); i++) {
                    System.out.println((i + 1) + ". ");
                    daftarpenerbangan.get(i).tampildaftarpenerbangan();
                }

                System.out.print("Pilih nomor penerbangan (ex: 1): ");
                int pilpnbgan = input.nextInt();
                pnbgnygdipilih = daftarpenerbangan.get(pilpnbgan - 1);
                System.out.println("Pemesanan Tiket Berhasil Dilakukan.");

            } else if(pilmenu == 3) {
                if (NIK != null && pnbgnygdipilih != null) {
                    System.out.println("====== Detail TIket Penerbangan ======");
                    penumpang Penumpang = new penumpang(NIK, namadpn, namablkng);
                    Penumpang.tampildaftarpenumpang();
                    pnbgnygdipilih.tampildaftarpenerbangan();
                } else {
                    System.out.println("Belum ada tiket yang dipesan. ");
                }

            } else if (pilmenu == 4) {
                System.out.println("Terima kasih!");
                berjalan = false;

            } else {
                System.out.println("Pilihan tidak valid. COba lagi");
            }
        }

        input.close();
    }
}
