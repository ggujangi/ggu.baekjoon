package hello_java.c_for;

import java.util.Scanner;

/**
 * #2739 구구단
 *
 * 구구단을 출력하는 문제
 */

public class Ex_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%s * %s = %s\n", n, i, n * i);
        }
    }
}
