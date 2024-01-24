package hw3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand = (int) (Math.random() * 100) + 1;

        System.out.println("開始猜數字吧!");
        while (true) {
            int a = scan.nextInt();
            if (a == rand) {
                System.out.printf("答對了！答案就是%d\n", a);
                break;
            } else {
                System.out.print("猜錯囉！");
                if (a < rand) {
                    System.out.println("小於正確答案");
                } else {
                    System.out.println("大於正確答案");
                }
            }
        }
        scan.close();
    }
}
