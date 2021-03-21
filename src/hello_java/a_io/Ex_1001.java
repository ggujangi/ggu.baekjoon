package hello_java.a_io;

import java.util.Scanner;

/**
 * #1001 A-B
 *
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 */

public class Ex_1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a - b);
    }
}
