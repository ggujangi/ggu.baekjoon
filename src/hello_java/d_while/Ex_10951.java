package hello_java.d_while;

import java.io.*;
import java.util.StringTokenizer;

/**
 * #10951 A+B - 4
 *
 * 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
 */

public class Ex_10951 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String s;

            while ((s = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(s);

                int a = Integer.parseInt(tokenizer.nextToken());
                int b = Integer.parseInt(tokenizer.nextToken());

                bw.write((a + b) + "\n");
            }
            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
