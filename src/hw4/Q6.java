package hw4;

public class Q6 {
    public static void main(String[] args) {
        int[][] grades = {
                {10, 35, 40, 100, 90, 85, 75, 70},
                {37, 75, 77, 89, 64, 75, 70, 95},
                {100, 70, 79, 90, 75, 70, 79, 90},
                {77, 95, 70, 89, 60, 75, 85, 89},
                {98, 70, 89, 90, 75, 90, 89, 90},
                {90, 80, 100, 75, 50, 20, 99, 75}
        };

        int [] maxCount = new int[8];

        for (int i = 0; i < grades.length; i++) {
            int max = grades[i][0];
            int index = 0;
            for (int j = 0; j < grades[i].length; j++) {
                if (grades[i][j] > max) {
                    max = grades[i][j];
                    index = j;

                }
            }
            maxCount[index] = maxCount[index] + 1;
        }

        for (int i = 0; i < maxCount.length; i++) {
            System.out.printf("%d,", maxCount[i]);
        }
    }
}
