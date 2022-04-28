import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, secim;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem Seçiniz: ");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("İşlem Sonucu: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("İşlem Sonucu: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("İşlem Sonucu: "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("Tanımsız");
                }else{
                    System.out.println("İşlem Sonucu: "+(sayi1/sayi2));
                }
                break;
        }


    }
}
