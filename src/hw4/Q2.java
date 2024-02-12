package hw4;


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(new StringBuilder(str).reverse().toString());
    }
}
