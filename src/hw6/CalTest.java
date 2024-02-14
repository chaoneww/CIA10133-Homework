package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator c = new Calculator();

        while (true) {
            try {
                System.out.println("請輸入x的值：");
                int x = scan.nextInt();
                System.out.println("請輸入y的值：");
                int y = scan.nextInt();
                int result = c.powerXY(x, y);
                System.out.printf("%d的%d次方等於%d\n", x, y, result);
            } catch (CalException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("輸入格式不正確，請輸入整數值！");
                // Consume the invalid input
                scan.nextLine();
            }
        }
    }
}

class CalException extends Exception {
    public CalException(String message) {
        super(message);
    }
}

class Calculator {
    public int powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義！");
        }
        if (y < 0) {
            throw new CalException("次方為負值，結果回傳值不為整數！");
        }
        return (int) Math.pow(x, y);
    }
}