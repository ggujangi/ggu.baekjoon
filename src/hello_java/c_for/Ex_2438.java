package hello_java.c_for;

import java.io.*;

/**
 * #2438 별 찍기 - 1
 *
 * 별을 찍는 문제 1
 */

public class Ex_2438 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    bw.write("*");
                }
                bw.write("\n");
            }

            br.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
