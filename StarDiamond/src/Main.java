import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Basamak Sayısını Giriniz: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= (2 * i) - 1; x++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = (n - 1); j >= 0; j--) {
            for (int k = 1; k <= (n - j); k++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * j) - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}