import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, yas, tip;
        double tutar, indirimliTutar, kmUcret = 0.10, tipIndirimi;
        Scanner input = new Scanner(System.in);

        System.out.print("Tip Seçiniz (1-Tek Yön\n2-Gidiş-Dönüş): ");
        tip = input.nextInt();

        System.out.print("Km giriniz: ");
        km = input.nextInt();

        System.out.print("Yaş giriniz: ");
        yas = input.nextInt();

        tutar = km * kmUcret;

        if (tip == 1 || tip == 2) {
            if (yas >= 0) {
                if (yas >= 0 && yas < 12) {
                    indirimliTutar = tutar * 0.50;
                    if (tip == 2) {
                        tipIndirimi = indirimliTutar * 0.8;
                        System.out.println("Bilet Fiyatınız: " + tipIndirimi + " " + "TL");
                    } else {
                        System.out.println("Bilet Fiyatınız: " + indirimliTutar + " " + "TL");
                    }
                } else if (yas >= 12 && yas < 24) {
                    indirimliTutar = tutar * 0.9;
                    if (tip == 2) {
                        tipIndirimi = indirimliTutar * 0.8;
                        System.out.println("Bilet Fiyatınız: " + tipIndirimi + " " + "TL");
                    } else {
                        System.out.println("Bilet Fiyatınız: " + indirimliTutar + " " + "TL");
                    }
                } else if (yas > 65) {
                    indirimliTutar = tutar * 0.7;
                    if (tip == 2) {
                        tipIndirimi = indirimliTutar * 0.8;
                        System.out.println("Bilet Fiyatınız: " + tipIndirimi + " " + "TL");
                    } else {
                        System.out.println("Bilet Fiyatınız: " + indirimliTutar + " " + "TL");
                    }
                } else if (tip == 2) {
                    tipIndirimi = tutar * 0.8;
                    indirimliTutar = tipIndirimi;
                    System.out.println("Bilet Fiyatınız: " + indirimliTutar + " " + "TL");
                } else {
                    if (km < 0) {
                        System.out.println("Hatalı Veri Girdiniz !");
                    } else {
                        System.out.println("Bilet Fiyatınız: " + tutar + " " + "TL");
                    }
                }
            }else{
                System.out.println("Yaşınız 0'dan küçük olamaz !");
            }

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }


    }
}