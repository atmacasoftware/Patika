import java.util.Objects;
import java.util.Scanner;

public class Main {

    static int metot(int N,String value,int tempN) {

        if(N>=0 && Objects.equals(value, "-5")){
            System.out.print(N+" ");
            return metot(N-5,value,tempN);
        }else{
            value="+5";
            System.out.print(N+" ");
            if(N==tempN){
                return tempN;
            }else{
                return metot(N+5,value,tempN);
            }
        }
    }

    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        N = input.nextInt();
        int temp = N;
        String value="-5";
        metot(N,value,temp);
    }

}
