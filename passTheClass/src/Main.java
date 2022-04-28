import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matemaik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 || muzik < 0 || muzik > 100 || turkce < 0 || turkce > 100){
            System.out.println("Girdiniz notlar 0 - 100 arasında olması gerekmektedir !");
        } else {
            average = (mat + fizik + turkce + kimya + muzik) / 5;
            System.out.println("Ortalamanız: "+average);
            if(average < 55){
                System.out.println("Sınıfı geçemediniz !");
            }else{
                System.out.println("Tebrikler! Sınıfı başarılı bir şekilde geçtiniz.");
            }
        }

    }
}