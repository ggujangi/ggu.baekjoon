package hello_kotlin.c_for

import java.io.*

/**
 * #2741 기찍 N
 *
 * 제문 는하력출 지까N 터부1
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in readLine().toInt() downTo 1) writer.write("$i\n")

    writer.flush()
    writer.close()
    close()
}