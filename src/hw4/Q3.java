package hw4;

public class Q3 {
    public static void main(String[] args) {
        String[] strs = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int count = 0;

        for (String str : strs) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                    count++;
            }
        }

        System.out.println(count);
    }
}
