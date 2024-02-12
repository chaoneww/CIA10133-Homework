package hw4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
                {25, 2500},
                {32, 800},
                {8, 500},
                {19, 1000},
                {27, 1200},
        };
        Scanner scan = new Scanner(System.in);

        System.out.print("你想借多少: ");
        int a = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] >= a) {
                System.out.println(arr[i][0]);
                System.out.println(arr[i][1]);
            }
        }


    }
}
