import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double kilo,boy,indeks;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        if(boy < 0 | kilo < 0){
            System.out.print("Lütfen negatif değer girmeyiniz!");
        } else{
            indeks = (kilo)/(boy*boy);
            System.out.println("Vücut Kitle İndeksiniz: "+indeks);
            if(indeks<18.50){
                System.out.print("Zayıf!");
            } else if (18.50<=indeks & indeks<=24.9) {
                System.out.print("Normal!");
            } else if(24.9<=indeks & indeks<=34.9){
                System.out.print("Şişman!");
            } else if (34.9 < indeks & indeks <= 44.9) {
                System.out.print("İkinci Derece Şişman!");
            }else {
                System.out.print("Obez!");
            }
        }
    }
}