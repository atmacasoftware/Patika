import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, ebob = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        //EBOB
        int j = n1;
        while (j > 1) {
            if (n1 % j == 0 && n2 % j == 0) {
                ebob = j;
                break;
            }

            j--;
        }
        System.out.println("EBOB: " + ebob);


        //EKOK
        int i = 1;
        while (i < (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("EKOK: "+i);
                break;
            }
            i++;
        }

        System.out.println("Sağlama: "+(n1*n2)/ebob);


    }
}