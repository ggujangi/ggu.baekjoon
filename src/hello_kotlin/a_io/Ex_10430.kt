package hello_kotlin.a_io

import java.util.*

/**
 * #10430 나머지
 *
 * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 */

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val c = nextInt()

    println((a + b) % c)
    println((a % c + b % c) % c)
    println(a * b % c)
    println(a % c * (b % c) % c)
}