package hello_java.c_for;

import java.util.Scanner;

/**
 * #8393 합
 *
 * 1부터 N까지의 합을 구하는 문제. 물론 반복문 없이 풀 수도 있습니다.
 */

public class Ex_8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.print(sum);
//        System.out.print(((n + 1) * n) / 2);
    }
}
