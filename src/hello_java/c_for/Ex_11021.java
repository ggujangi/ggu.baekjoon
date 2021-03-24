package hello_java.c_for;

import java.io.*;
import java.util.StringTokenizer;

/**
 * #11021 A+B - 7
 *
 * A+B를 조금 더 아름답게 출력하는 문제
 */

public class Ex_11021 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int t = Integer.parseInt(br.readLine());

            for (int i = 1; i <= t; i++) {
                StringTokenizer tokenizer = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(tokenizer.nextToken());
                int b = Integer.parseInt(tokenizer.nextToken());
                bw.write("Case #" + i + ": " + (a + b) + "\n");
            }

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
