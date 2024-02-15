package hw3;

import java.util.HashSet;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        v2();
    }

    public static void v1() {
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

    // 進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複
    public static void v2() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            HashSet hashSet = new HashSet();

            int count = 0;
            System.out.println("請輸入你討厭哪個數字：");
            int a = scan.nextInt();

            while (hashSet.size() < 6) {
                int n = (int) (Math.random() * 49) + 1;
                if (n % 10 == a || n / 10 == a) {
                    continue;
                }
                hashSet.add(n);
            }
            System.out.println(hashSet);
        }
    }
}
