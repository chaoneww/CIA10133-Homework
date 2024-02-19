package hw7;

import java.io.*;

public class Q2 {
    public static void main(String[] args) {
//        try {
//            FileWriter fw = new FileWriter("./src/hw7/Data.txt", true);
//            BufferedWriter bw = new BufferedWriter(fw);
//
//            for (int i = 0; i < 10; i++) {
//                int n = (int)(Math.random() * 1000 ) + 1;
//                bw.write(Integer.toString(n));
//                bw.newLine();
//            }
//
//            bw.close();
//            fw.close();
//
//        } catch (IOException e) {
//            System.err.println(e);
//        }｢

        try {
            FileWriter fw = new FileWriter("./src/hw7/Data.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < 10; i++) {
                int n = (int)(Math.random() * 1000 ) + 1;
                pw.println(n);
            }

            pw.close();
            fw.close();

        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
