import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int acilis=10;
        double gidilenYol,kmUcret=2.20, tutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Mesafe Giriniz: ");
        gidilenYol = input.nextDouble();

        tutar = acilis + (gidilenYol*kmUcret);

        if (tutar < 20){
            tutar = 20;
        }else {
            tutar = acilis + (gidilenYol*kmUcret);
        }

        System.out.print("Taksimetre Ücreti: "+tutar);

    }
}
