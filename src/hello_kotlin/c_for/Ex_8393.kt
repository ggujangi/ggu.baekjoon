package hello_kotlin.c_for

import java.util.*

/**
 * #8393 합
 *
 * 1부터 N까지의 합을 구하는 문제. 물론 반복문 없이 풀 수도 있습니다.
 */

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    var sum = 0
    for (i in 1..n) sum += i

    print(sum)
}