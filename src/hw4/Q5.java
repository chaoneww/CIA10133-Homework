package hw4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int[] months1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        final int[] months2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            System.out.print("請輸入三個整數分別代表yyyy年mm月dd日");

            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();

            // 閏年的規則
            if (year % 4 == 0) {

            }

            if (month > 12 || month < 1) {
                System.out.println("月份輸入錯誤");
                continue;
            }

        }


    }
}
