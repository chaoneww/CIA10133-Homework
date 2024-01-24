package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("請輸入三個整數：");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        Q1 q1 = new Q1();

        if (q1.isValidTriangle(a, b, c)) {
            if (q1.isEquilateral(a, b, c)) {
                System.out.println("正三角形");
            } else if (q1.isIsosceles(a, b, c)) {
                System.out.println("等腰三角形");
            } else if (q1.isRight(a, b, c)) {
                System.out.println("直角三角形");
            } else {
                System.out.println("其他三角形");
            }
        } else {
            System.out.println("不是三角形");
        }

        scan.close();
    }

    public boolean isValidTriangle(int side1, int side2, int side3) {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquilateral(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isIsosceles(int side1, int side2, int side3) {
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isRight(int side1, int side2, int side3) {
        int[] sides = {side1, side2, side3};
        Arrays.sort(sides);
        if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
            return true;
        } else {
            return false;
        }
    }
}
