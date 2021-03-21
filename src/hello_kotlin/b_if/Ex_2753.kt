package hello_kotlin.b_if

import java.util.*

/**
 * #2753 윤년
 *
 * 윤년을 판별하는 문제
 */

fun main() = with(Scanner(System.`in`)) {
    val year = nextInt()

    print(
        when {
            year % 4 == 0 && year % 100 != 0
                    || year % 400 == 0 -> 1
            else -> 0
        }
    )
}