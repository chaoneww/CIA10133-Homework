package hw5;

public class Q3 {
    int maxElement(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i[] : arr) {
            for (int j : i) {
                max = max < j ? j : max;
            }
        }
        return max;
    }

    double maxElement(double[][] arr) {
        double max = Double.MIN_VALUE;
        for (double[] i : arr) {
            for (double j : i) {
                max = max < j ? j : max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };

        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };
        Q3 q3 = new Q3();
        q3.maxElement(intArray);
        System.out.println(q3.maxElement(intArray));
        System.out.println(q3.maxElement(doubleArray));
    }
}
