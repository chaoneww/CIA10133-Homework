package hw4;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;

        for (int k : arr) {
            sum += k;
        }

        int avg = sum/arr.length;
        System.out.printf("平均值: %d\n", avg);

        for (int j : arr) {
            if (j > avg) {
                System.out.print(j);
                System.out.print(", ");
            }
        }
    }
}
