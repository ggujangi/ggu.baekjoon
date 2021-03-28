package hello_java.d_while;

import java.io.*;

/**
 * #1110 더하기 사이클
 *
 * 원래 수로 돌아올 때까지 연산을 반복하는 문제
 */

public class Ex_1110 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int number = Integer.parseInt(br.readLine());
            int copy = number;
            int count = 0;

            do {
                number = ((number % 10) * 10) + (((number / 10) + (number % 10)) % 10);
                count++;
            } while (number != copy);

            bw.write(String.valueOf(count));
            bw.flush();
            bw.close();
            br.close();
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
