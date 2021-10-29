import java.util.Scanner;
public class Latihan5Soal3 {

	public static void main(String[] args) {
        Scanner zaii = new Scanner(System.in);
        String tujuan = zaii.nextLine();
        int penumpang = zaii.nextInt();
        int tiketJakarta = 145000;
        int tiketBogor = 200000;
        int tiketGarut = 75000;
        int tiketPurwakarta = 75000;
        valez.close();

        switch(tujuan) {
            case "Jakarta":
            System.out.println(penumpang * tiketJakarta);
            break;

            case "Bogor":
            System.out.println(penumpang * tiketBogor);
            break;

            case "Garut":
            System.out.println(penumpang * tiketGarut);
            break;

            case "Purwakarta":
            System.out.println(penumpang * tiketPurwakarta);
            break;
    }   }    
}

