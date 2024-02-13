package hw5;

public class Q1 {
    public void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.starSquare(5, 4);
    }
}
