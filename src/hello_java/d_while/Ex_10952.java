package hello_java.d_while;

import java.io.*;
import java.util.StringTokenizer;

/**
 * #10952 A+B - 5
 *
 * 0 0이 들어올 때까지 A+B를 출력하는 문제
 */

public class Ex_10952 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            while (true) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(tokenizer.nextToken());
                int b = Integer.parseInt(tokenizer.nextToken());

                if (a == 0 && b == 0) break;
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
