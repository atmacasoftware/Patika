import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, stepNumber = 0, total = 0;

        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        int tempNumber = number;
        int stepValue;

        while (tempNumber != 0) {
            tempNumber /= 10;
            stepNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            total += stepValue;
            tempNumber /= 10;
        }

        System.out.println(number+"sayısının rakamları toplamı =>"+total);

    }
}