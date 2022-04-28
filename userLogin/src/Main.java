import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = input.nextLine();

        System.out.print("Parolanız: ");
        password = input.nextLine();

        if(userName.equals("ahmet")){
            if(password.equals("atmaca")){
                System.out.println("Giriş yapıldı. Hoşgeldiniz!");
            }else{
                System.out.println("Parolanız hatalı!");
            }
        }else{
            System.out.println("Kullanıcı adınız hatalı!");
        }

    }
}