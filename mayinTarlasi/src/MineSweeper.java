import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber, size;
    String[][] map;
    int[][] board;
    boolean isGame = true;

    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber * colNumber;
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (!Objects.equals(map[randRow][randCol], "*")) {
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }

    public void printGame(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (!Objects.equals(arr[i][j], "*"))
                    System.out.print("-" + " ");
                if (Objects.equals(arr[i][j], "*"))
                    System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public void printBoard(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0)
                    if (arr[i][j] == 0) {
                        System.out.print("-" + " ");
                    }
                if (arr[i][j] > 0) {
                    System.out.print(arr[i][j] + " ");
                }

                if (arr[i][j] == -2) {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public void checkMine(int row, int col) {

        if ((col < colNumber - 1) && Objects.equals(map[row][col + 1], "*")) {
            board[row][col]++;
        }

        if ((row < rowNumber - 1) && Objects.equals(map[row + 1][col], "*")) {
            board[row][col]++;
        }

        if ((row > 0) && Objects.equals(map[row - 1][col], "*")) {
            board[row][col]++;
        }

        if ((col > 0) && Objects.equals(map[row][col - 1], "*")) {
            board[row][col]++;
        }

        if ((col < colNumber - 1 && row < rowNumber - 1) && Objects.equals(map[row + 1][col + 1], "*")) {
            board[row][col]++;
        }

        if ((col > 0 && row < rowNumber - 1) && Objects.equals(map[row + 1][col - 1], "*")) {
            board[row][col]++;
        }

        if ((col > 0 && row > 0) && Objects.equals(map[row - 1][col - 1], "*")) {
            board[row][col]++;
        }

        if ((col < colNumber - 1 && row > 0) && Objects.equals(map[row - 1][col + 1], "*")) {
            board[row][col]++;
        }

        if (board[row][col] == 0) {
            board[row][col] = -2;
        }

    }

    public boolean isIndex(int row, int col) {

        if(row < 0 || row >=rowNumber){
            return false;
        }

        if(col < 0 || row >=colNumber){
            return false;
        }
        return true;
    }

    public void run() {
        int row, col, success = 0;
        prepareGame();
        printGame(map);
        System.out.println("Oyun Başladı!");
        while (isGame) {
            printBoard(board);
            System.out.println("Satır: ");
            row = scan.nextInt();
            System.out.println("Sütun: ");
            col = scan.nextInt();


            if (isIndex(row, col)) {
                if (!Objects.equals(map[row][col], "*")) {
                    checkMine(row, col);
                    success++;
                    if (success == (size - (size / 4))) {
                        System.out.println("Tebrikler. Mayınlara basmadan oyunu tamamlandınız!");
                        break;
                    }
                } else {
                    isGame = false;
                    System.out.println("Game Over");
                }
            }else {
                System.out.println("Geçersiz koordinat girdiniz.");
                continue;
            }

        }
    }


}
