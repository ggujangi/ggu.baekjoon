package hello_java.b_if;

import java.util.Scanner;

/**
 * #2753 윤년
 *
 * 윤년을 판별하는 문제
 */

public class Ex_2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        int result = 0;
        if (year % 4 == 0 && year % 100 != 0
                || year % 400 == 0) result = 1;

        System.out.print(result);

    }
}
