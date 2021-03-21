package hello_kotlin.a_io

import java.util.*

/**
 * #10869 사칙연산
 *
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 */

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()

    println(a + b)
    println(a - b)
    println(a * b)
    println(a / b)
    println(a % b)
}