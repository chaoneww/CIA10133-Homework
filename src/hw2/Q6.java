package hw2;

public class Q6 {
	public static void main(String[] args) {
		System.out.println("q6: ");
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}