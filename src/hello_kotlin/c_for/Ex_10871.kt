package hello_kotlin.c_for

import java.io.*
import java.util.*

/**
 * #10871 X보다 작은 수
 *
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var tokenizer = StringTokenizer(readLine())

    val n = tokenizer.nextToken().toInt()
    val x = tokenizer.nextToken().toInt()

    tokenizer = StringTokenizer(readLine())

    for (i in 1..n) {
        val num: Int = tokenizer.nextToken().toInt()
        if (num < x) writer.write("$num ")
    }

    writer.flush()
    writer.close()
    close()
}