import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, nFak = 1, rFak = 1, nrFak = 1, combinasyon;
        Scanner input = new Scanner(System.in);

        System.out.print("n degeri giriniz:");
        n = input.nextInt();

        System.out.print("r degeri giriniz:");
        r = input.nextInt();

        if (r < n) {
            for (int i = 1; i <= n; i++) {
                nFak = nFak * i;
            }

            for (int k = 1; k <= r; k++) {
                rFak = rFak * k;
            }
            for (int m = 1; m <= (n - r); m++) {
                nrFak = nrFak * m;
            }

            combinasyon = (nFak) / (rFak * nrFak);
            System.out.print("Combinasyon:" + combinasyon);
        }else{
            System.out.print("r değeri n değerinden küçük olamaz!");
        }


    }
}