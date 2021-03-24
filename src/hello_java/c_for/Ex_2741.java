package hello_java.c_for;

import java.io.*;

/**
 * #2741 N 찍기
 *
 * 1부터 N까지 출력하는 문제
 */

public class Ex_2741 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                bw.write(i + "\n");
            }

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
