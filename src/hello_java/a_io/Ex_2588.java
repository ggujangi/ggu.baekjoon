package hello_java.a_io;

import java.util.Scanner;

/**
 * #2588 곱셈
 *
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *          4  7  2  ------ (1)
 *       x  3  8  5  ------ (2)
 * -----------------
 *       2  3  6  0  ------ (3)
 *    3  7  7  6     ------ (4)
 * 1  4  1  6        ------ (5)
 * -------------------
 * 1  8  1  7  2  0  ------ (6)
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

public class Ex_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String[] bSplit = String.valueOf(b).split("");
        int bLength = bSplit.length;

        for (int i = bLength - 1; i >= 0; i--) {
            System.out.println(a * Integer.parseInt(bSplit[i]));
        }

        System.out.println(a * b);
    }
}
