package hw5;

public class Q5 {
    static String genAuthCode() {
        char[] arr = {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
        };
        char[] code = new char[8];

        for (int i = 0; i < code.length; i++) {
            // get random number from 0 to 61
            int rand = (int) (Math.random() * 62);
            code[i] = arr[rand];
        }
        return new String(code);
    }

    public static void main(String[] args) {
        System.out.println(genAuthCode());
    }
}
