package hw2;

public class Q7 {
	public static void main(String[] args) {
		// ASCII for 'A'
 		System.out.println("q7: ");
		int code = 65;
		
		for (int i = 1; i <= 6; i++, code++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)code);
			}
			System.out.println();
		}
	}
}