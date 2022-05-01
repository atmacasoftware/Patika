import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        sayi = input.nextInt();

        for (i = 0; i <= sayi;i++) {
            if ((i %3 == 0) && (i %4 == 0)){
                System.out.println("3 ve 4 'e Bölünebilen Sayılar: "+i);
            }
        }
    }
}