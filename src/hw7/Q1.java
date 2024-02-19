package hw7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Q1 {
    public static void main(String[] args) {
        try {
            String fileName = "./src/hw7/Sample.txt";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            int byteCount = 0;
            int charCount = 0;
            int lineCount = 0;

            // 計算 byte
            while (fis.read() != -1) {
                byteCount++;
            }

            // 計算字元數與列數
            String line;
            while ((line = br.readLine()) != null) {
                // readLine() 會返回讀取到的字串
                charCount += line.length();
                lineCount++;
            }

            System.out.println(fileName + "檔案共有" + byteCount + "個位元組," + charCount + "個字元," + lineCount + "列資料");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
