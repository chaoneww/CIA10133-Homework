package hw1;

public class Hw1 {
    public static void main(String[] args) {
        // 第一題
        int a = 12;
        int b = 6;
        System.out.println("第一題:");
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println();

        // 第二題
        double egg = 200;
        System.out.println("第二題:");
        System.out.println(egg / 12);
        System.out.println();

        // 第三題
        int second = 256559;
        int day = second / (24 * 3600);
        int remainSecond = second % (24 * 3600);
        int hour = remainSecond / 3600;
        remainSecond = remainSecond % 3600;
        int minute = remainSecond / 60;
        remainSecond = remainSecond % 60;
        System.out.println("第三題:");
        System.out.printf("%d 天 %d 小時 %d 分 %d 秒\n", day, hour, minute, remainSecond);
        System.out.println();

        // 第四題
        final double PI = 3.1415;
        double area = 5 * 5 * PI;
        double circumference = 5 * 2 * PI;
        System.out.println("第四題:");
        System.out.printf("圓面積: %f\n", area);
        System.out.printf("圓周長: %f\n", circumference);
        System.out.println();

        // 第五題
        double money = 1500000;
        double rate = 0.02;
        int year = 10;
        for (int i = 0; i < year; i++) {
            money += money * rate;
        }
        double result = money;
        System.out.println("第五題:");
        System.out.printf("總額: %f\n", result);
        System.out.println();

        // 第六題
        System.out.println("第六題:");
        System.out.println(5 + 5); // 整數相加結果為 55
        System.out.println(5 + '5'); // '5'的 ASCII Code 是53，和 5 相加得到58
        System.out.println(5 + "5"); // 此為 String 的連接，結果是 "55"
        System.out.println();

    }
}
