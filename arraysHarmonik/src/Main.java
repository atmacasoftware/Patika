public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        double result = 0;
        for (double i:list){
            result+=1/i;
        }

        double average = list.length/result;
        System.out.println("Harmonik ortalama: "+ average);

    }
}
