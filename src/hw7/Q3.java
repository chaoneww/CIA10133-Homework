package hw7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        copyFile("cp1.txt", "cp2.txt");
    }


    static void copyFile(String file1, String file2) {
        int i;

        try {
            FileReader fr = new FileReader("./src/hw7/" + file1);
            FileWriter fw = new FileWriter("./src/hw7/" + file2);

            while ((i = fr.read()) != -1) {
                System.out.print((char)i);
                fw.append((char)i);
            }

            fw.close();
            fr.close();

        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
