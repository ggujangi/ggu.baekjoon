package hello_java.c_for;

import java.io.*;

/**
 * #2741 기찍 N
 *
 * 제문 는하력출 지까N 터부1
 */

public class Ex_2742 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            for (int i = n; i > 0; i--) {
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
