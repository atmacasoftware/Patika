import java.util.Scanner;

public class Main {

    static int recursivePower(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * recursivePower(base, power - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Üssü alınacak sayı giriniz: ");
            int x = input.nextInt();
            System.out.print("Kuvvet: ");
            int y = input.nextInt();
            System.out.println(x + " üssü " + y + ": " + recursivePower(x, y));
        }
    }
}
