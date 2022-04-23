import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double tutar,kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Miktari Giriniz: ");
        tutar = input.nextDouble();

        if(tutar < 1000){
            kdvliTutar = tutar*(1.18);
            System.out.print("KDV'li Tutar: "+kdvliTutar);
        }else if (1000 <= tutar){
            kdvliTutar = tutar*(1.08);
            System.out.print("KDV'li Tutar: "+kdvliTutar);
        }else{
            System.out.print("Hatalı bir değer girdiniz.");
        }

    }
}
