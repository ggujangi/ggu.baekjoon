package hello_kotlin.d_while

import java.io.*

/**
 * #1110 더하기 사이클
 *
 * 원래 수로 돌아올 때까지 연산을 반복하는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var number = readLine().toInt()
    var copy = number
    var count = 0

    do {
        number = number % 10 * 10 + (number / 10 + number % 10) % 10
        count++
    } while (copy != number)

    writer.write(count.toString())
    writer.flush()
    writer.close()
    close()
}