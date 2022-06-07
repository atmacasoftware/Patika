import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row, col;
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz!");
        System.out.println("Lütfen oynamak istediğiniz oyunun boyutlarını giriniz! ");
        System.out.print("Satır Sayısı: ");
        row = scan.nextInt();

        System.out.print("Sütün Sayısı: ");
        col = scan.nextInt();

        MineSweeper mainSweeper = new MineSweeper(row,col);
        mainSweeper.run();

    }
}
