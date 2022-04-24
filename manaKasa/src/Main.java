import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int armut=0, elma=0, domates=0, muz=0, patlican=0;
        double armutKgFiyati=2.14, elmaKgFiyati = 3.67, domatesKgFiyati=1.11, muzKgFiyati=0.95,patlicanKgFiyati=5.00,tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ?: ");
        armut = input.nextInt();

        System.out.print("Elma Kaç Kilo ?: ");
        elma = input.nextInt();

        System.out.print("Domates Kaç Kilo ?: ");
        domates = input.nextInt();

        System.out.print("Muz Kaç Kilo ?: ");
        muz = input.nextInt();

        System.out.print("Patlıcan Kaç Kilo ?: ");
        patlican = input.nextInt();

        tutar = (armut*armutKgFiyati)+(elma*elmaKgFiyati)+(domates*domatesKgFiyati)+(muz*muzKgFiyati)+(patlican*patlicanKgFiyati);
        System.out.println("Toplam Tutar: "+tutar+""+"TL");
    }
}