package hello_kotlin.b_if

import java.util.*

/**
 * #1330 두 수 비교하기
 *
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 */

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()

    print(
        when {
            a > b -> ">"
            a < b -> "<"
            else -> "=="
        }
    )
}