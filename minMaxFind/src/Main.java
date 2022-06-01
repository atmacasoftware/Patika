import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int sayi;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        Arrays.sort(list);

        for (int i = 0; i < list.length; i++) {
            if (sayi < list[i]) {
                System.out.println("Girilen sayıdan küçük en yakın sayı\t: "+ list[i]);
                System.out.println("Girilen sayıdan büyük en yakın sayı\t: "+ list[i - 1]);
                break;
            }
        }

    }
}
