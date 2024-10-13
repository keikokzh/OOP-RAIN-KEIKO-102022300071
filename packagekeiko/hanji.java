package packagekeiko;

import java.util.Scanner;

public class hanji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan nilai Tugas Besar: ");
        double nilaitubes = input.nextDouble();

        System.out.print("Masukkan nilai Quiz: ");
        double nilaiquiz = input.nextDouble();

        System.out.print("Masukkan nilai Tugas: ");
        double nilaitugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        double nilaiuts = input.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        double nilaiuas = input.nextDouble();

        chingcheng hanji = new chingcheng(nilaitubes, nilaiquiz, nilaitugas, nilaiuts, nilaiuas);
        double totalnilai = hanji.hitungtotalnilai();

        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + totalnilai);

        input.close();

    }
    
}
