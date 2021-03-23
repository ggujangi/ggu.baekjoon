package hello_java.b_if;

import java.util.Scanner;

/**
 * #9498 시험 성적
 *
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
 * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */

public class Ex_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        String result;
        if (score >= 90) result = "A";
        else if (score >= 80) result = "B";
        else if (score >= 70) result = "C";
        else if (score >= 60) result = "D";
        else result = "F";

        System.out.print(result);
    }
}
