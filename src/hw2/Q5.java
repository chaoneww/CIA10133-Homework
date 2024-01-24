package hw2;

public class Q5 {
	public static void main(String[] args) {
		System.out.println("q5: ");
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == 4 || i / 10 == 4) {
				continue;
			} else {
				System.out.print(i);
				System.out.print(' ');
			}
		}
		System.out.println();
	}
}