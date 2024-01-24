package hw3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("請輸入你討厭哪個數字：");
        int a = scan.nextInt();
        for (int i = 1; i <= 49; i++) {
            if (i % 10 == a || i / 10 == a) {
                continue;
            } else {
                System.out.printf("%d ", i);
                count++;
            }
        }
        System.out.println();
        System.out.printf("總共有 %d 個數字可選\n", count);
    }

}
