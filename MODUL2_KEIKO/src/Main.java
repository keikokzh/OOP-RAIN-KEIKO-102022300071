public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer kom = new Komputer(20, "Warnet FUFUFAFA", 5000);

        // To do: Panggillah Method Informasi dari class Komputer
        kom.Informasi();

        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komVIP = new KomputerVIP(100, "Warnet Ambatron", 6900, true);

        // To do: Panggillah Method Informasi dari class KomputerVIP
        komVIP.Informasi();

        // To do: Panggillah Method Login
        komVIP.Login("Keiko");

        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komVIP.Bermain(3);

        komVIP.Bermain(3, 1);
        

        System.out.println(" ");


        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komPre = new KomputerPremium(35, "Warnet Mulyono", 5000, true);

        // To do: Panggillah Method Informasi dari class KomputerPremium
        komPre.Informasi();

        // To do: Panggillah Method Pesan
        komPre.Pesan(8);

        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        komPre.TambahLayanan("Siomay");

        komPre.TambahLayanan("Batagor", "Cocacola");
       
    }
}