package hello_java.b_if;

import java.util.Scanner;

/**
 * #1330 두 수 비교하기
 *
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */

public class Ex_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String result = "";
        if (a > b) result = ">";
        else if (a < b) result = "<";
        else result = "==";

        System.out.println(result);
    }
}
