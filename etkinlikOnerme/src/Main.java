import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weather;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Kaç Derece?: ");
        weather = input.nextDouble();

        if(weather < 5){
            System.out.println("Havalar soğuk... Sana kayak yapmayı öneriyorum!");
        } else if (weather >= 5 && weather < 15) {
            System.out.println("Bu havada yapılabilecek en iyi etkinlik sinemaya gitmek!");
        } else if (weather >= 15 && weather < 25) {
            System.out.println("Piknik yapmaya gidebilirsin!");
        }else if(weather >= 25){
            System.out.println("Hava çok sıcak! Bence yüzmeye gitmelisin");
        }else{
            System.out.println("Hatalı bir değer girdiniz!");
        }

    }
}
