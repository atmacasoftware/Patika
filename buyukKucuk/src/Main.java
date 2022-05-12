import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int N, gs, buyuk=0, kucuk=0;

        System.out.print("Kaç tane sayı giriceksiniz?: ");
        N = input.nextInt();

        for(int i=1;i<=N;i++){
            System.out.print(i+". Sayı");
            gs = input.nextInt();
            if(i==1){
                buyuk = gs;
                kucuk = gs;
            }else{
                if(buyuk < gs){
                    buyuk = gs;
                }else if(kucuk > gs){
                    kucuk = gs;
                }
            }
        }
        System.out.println("En Büyük Sayı: "+buyuk);
        System.out.println("En Küçük Sayı: "+kucuk);
    }
}
