import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int math,fizik,kimya,turkce,tarih,muzik, toplam;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        math = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        toplam = (math + fizik + kimya + turkce + tarih + muzik);
        sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: "+ sonuc);

        if (sonuc >= 60){
            System.out.print("Sınıfı Geçtiniz!");
        }else{
            System.out.print("Sınıfı Geçemediniz!");
        }
    }
}
