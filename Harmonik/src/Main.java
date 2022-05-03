import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double result = 0.0;
        System.out.print("N sayısını giriniz: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i=1;i<=n;i++){
            result += (1.0/i);
        }

        System.out.print(result);

    }
}