import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,kuvvet,toplam=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban Değeri Giriniz: ");
        taban = input.nextInt();

        System.out.print("Kuvvet Değeri Giriniz: ");
        kuvvet = input.nextInt();

        if(kuvvet==0){
            System.out.print(taban+"^0=1");
        }else{
            for(int i=1;i<=kuvvet;i++){
                toplam *= taban;
            }
            System.out.print("Cevap:" +toplam);
        }

    }
}