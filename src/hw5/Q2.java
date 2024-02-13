package hw5;

public class Q2 {
    public void randAvg() {
        int[] randNums = new int[10];
        int sum = 0;
        System.out.println("本次亂數結果：");
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 101);
            randNums[i] = n;
            sum += n;
            System.out.printf("%d, ", n);
        }
        System.out.println();
        System.out.println("平均值：");
        System.out.println(sum / 10);
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
        q2.randAvg();
    }
}
