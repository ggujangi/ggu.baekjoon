package hello_kotlin.c_for

import java.util.*

/**
 * #2739 구구단
 *
 * 구구단을 출력하는 문제
 */

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()

    for (i in 1..9) println("$n * $i = ${n * i}")
}