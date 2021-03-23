package hello_java.b_if;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * #2884 알람 시계
 *
 * 시간 뺄셈 문제
 */

public class Ex_2884 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        LocalTime time = LocalTime.of(hour,minute).minusMinutes(45);

        System.out.printf("%s %s", time.getHour(), time.getMinute());
    }
}
