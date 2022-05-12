import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, total = 0;

        System.out.print("Bir sayı girniz: ");
        sayi = input.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                total += i;
            }
        }

        System.out.println(total);
        if (total == sayi) {
            System.out.print(sayi + "'sı mükemmel sayıdır.");
        } else {
            System.out.print(sayi + "'sı mükemmel sayı değildir.");
        }

    }
}
