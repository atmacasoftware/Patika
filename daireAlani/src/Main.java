import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int r,a;
        double pi=3.14,alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı Yazını: ");
        r = input.nextInt();

        System.out.print("Merkez Açısını Yazını: ");
        a = input.nextInt();

        alan = (pi*(r*r)*a)/360;
        System.out.println("Daire Alanı: "+alan);
    }
}
