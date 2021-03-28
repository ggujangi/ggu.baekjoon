package hello_java.e_array;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * #10818 최소, 최대
 *
 * 최솟값과 최댓값을 찾는 문제
 */

public class Ex_10818 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int n = Integer.parseInt(br.readLine());
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());

            int[] array = new int[n];

            for(int i = 0; i < n; i++){
                array[i] = Integer.parseInt(tokenizer.nextToken());
            }

            bw.write(Arrays.stream(array).min().getAsInt() + " " + Arrays.stream(array).max().getAsInt());
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
