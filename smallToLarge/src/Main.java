import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        int boyut;
        System.out.print("Dizinin boyunu giriniz: ");
        boyut = input.nextInt();
        int[] list = new int[boyut];
        int index = 0;
        int i = 0;
        while (i < boyut) {
            System.out.print((i + 1) + ". Elemanı: ");
            sayi = input.nextInt();
            list[index++] = sayi;
            i++;
        }
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));

    }
}
