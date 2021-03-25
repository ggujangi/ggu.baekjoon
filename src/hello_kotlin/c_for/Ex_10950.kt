package hello_kotlin.c_for

import java.util.*

/**
 * #10950 A+B - 3
 *
 * A+B를 여러 번 출력하는 문제
 */

fun main() = with(Scanner(System.`in`)){
    for(i in 1..nextInt()){
        println(nextInt() + nextInt())
    }
}