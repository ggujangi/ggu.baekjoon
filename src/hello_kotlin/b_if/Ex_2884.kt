package hello_kotlin.b_if

import java.time.LocalTime
import java.util.*

/**
 * #2884 알람 시계
 *
 * 시간 뺄셈 문제
 */

fun main() = with(Scanner(System.`in`)){
    val hour = nextInt()
    val minute = nextInt()

    val time = LocalTime.of(hour, minute).minusMinutes(45)

    print("${time.hour} ${time.minute}")
}