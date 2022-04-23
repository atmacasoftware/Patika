import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a,b,hipotenusKare,hipotenus,u,cevre,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a = input.nextInt();

        System.out.print("2. Kenarı Giriniz: ");
        b = input.nextInt();

        hipotenusKare = (a*a) + (b*b);
        hipotenus = Math.sqrt(hipotenusKare);
        System.out.println("Hipotenüs Uzunluğu: " +hipotenus);

        u = (a+b+hipotenus)/2;
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-hipotenus));

        System.out.println("Çevresi: " +cevre);
        System.out.println("Alanı: " +alan);

    }
}
