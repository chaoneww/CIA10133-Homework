package hw2;

public class TestNineNine {
    static void forWhile() {
        for (int i = 1; i <= 9; i++) {
            int j = 1;
            while (j <= 9) {
                System.out.printf("%d*%d=%d\t", i, j, i * j);
                j++;
            }
            System.out.println();
        }
    }

    static void forDoWhile() {
        for (int i = 1; i <= 9; i++) {
            int j = 1;
            do {
                System.out.printf("%d*%d=%d\t", i, j, i * j);
                j++;
            } while (j <= 9);
            System.out.println();
        }

    }

    static void whileDoWhile() {
        int i = 1;
        while (i <= 9) {
            int j = 1;
            do {
                System.out.printf("%d*%d=%d\t", i, j, i * j);
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        forWhile();
        System.out.println();
        forDoWhile();
        System.out.println();
        whileDoWhile();
        System.out.println();
    }
}
