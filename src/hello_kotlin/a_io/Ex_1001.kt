package hello_kotlin.a_io

import java.util.*

/**
 * #1001 A-B
 *
 * 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
 */

fun main() = with(Scanner(System.`in`)) {
    print(nextInt() - nextInt())
}