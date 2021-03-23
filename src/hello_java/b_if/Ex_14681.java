package hello_java.b_if;

import java.util.Scanner;

/**
 * #14681 사분면 고르기
 *
 * 점이 어느 사분면에 있는지 알아내는 문제
 */

public class Ex_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int result;

        if (x > 0 && y > 0) result = 1;
        else if (x < 0 && y > 0) result = 2;
        else if (x < 0 && y < 0) result = 3;
        else result = 4;

        System.out.print(result);
    }
}
