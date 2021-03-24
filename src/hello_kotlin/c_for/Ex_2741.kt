package hello_kotlin.c_for

import java.io.*

/**
 * #2741 N 찍기
 *
 * 1부터 N까지 출력하는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) writer.write("$i\n")

    writer.flush()
    writer.close()
    close()
}