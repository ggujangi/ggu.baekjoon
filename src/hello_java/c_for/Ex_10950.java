package hello_java.c_for;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * #10950 A+B - 3
 *
 * A+B를 여러 번 출력하는 문제
 */

public class Ex_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
