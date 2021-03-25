package hello_java.c_for;

import java.io.*;

/**
 * #2439 별 찍기 - 2
 *
 * 별을 찍는 문제 2
 */

public class Ex_2439 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    if (i >= j) bw.write("*");
                    else bw.write(" ");
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
