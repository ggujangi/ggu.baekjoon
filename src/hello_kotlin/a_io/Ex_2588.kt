package hello_kotlin.a_io

import java.util.*

/**
 * #2588 곱셈
 *
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *          4  7  2  ------ (1)
 *          3  8  5  ------ (2)
 * -----------------
 *       2  3  6  0  ------ (3)
 *    3  7  7  6     ------ (4)
 * 1  4  1  6        ------ (5)
 * -------------------
 * 1  8  1  7  2  0  ------ (6)
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()

    b.toString().split("".toRegex()).reversed().forEach {
        if (it.isNotEmpty()) {
            println(a * it.toInt())
        }
    }

    println(a * b)
}