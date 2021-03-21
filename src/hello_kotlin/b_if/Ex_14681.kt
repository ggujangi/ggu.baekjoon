package hello_kotlin.b_if

import java.util.*

/**
 * #14681 사분면 고르기
 *
 * 점이 어느 사분면에 있는지 알아내는 문제
 */

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()

    when {
        x > 0 && y > 0 -> print(1)
        x < 0 && y > 0 -> print(2)
        x < 0 && y < 0 -> print(3)
        else -> print(4)
    }
}