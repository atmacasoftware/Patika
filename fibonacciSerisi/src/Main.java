import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        int s1 = 0;
        int s2 = 1;
        int toplam;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(s1 + " , ");
            toplam = s1 + s2;
            s1 = s2;
            s2 = toplam;
        }

    }
}