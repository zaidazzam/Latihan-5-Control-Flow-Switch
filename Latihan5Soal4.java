import java.util.Scanner;
public class Latihan5Soal4{
	
    public static void main(String[] args){
        Scanner zaii = new Scanner (System.in);
        String kota = zaii.nextLine();
        int penumpang = zaii.nextInt();
        int harga = 0;
        int diskon = 0;
        int hargaDiskon = 0;
        int totalHarga = 0;

            switch (kota) {
            case "Jakarta":
            harga = 145000;
            System.out.print(harga*penumpang);
            break;
            
            case "Bogor":
            harga = 200000;
            totalHarga = harga*penumpang;
                if (totalHarga >= 250000) {
                diskon = totalHarga*10/100;
                totalHarga = totalHarga - diskon;
                }
            System.out.print(totalHarga);
            break;

            case "Garut":
            harga = 75000;
            System.out.print(harga*penumpang);
            break;

            case "Purwakarta":
            harga = 75000;
            System.out.print(harga*penumpang);
            break;
        }
    }
}