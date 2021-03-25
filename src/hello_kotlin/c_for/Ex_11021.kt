package hello_kotlin.c_for

import java.io.*
import java.util.*

/**
 * #11021 A+B - 7
 *
 * A+B를 조금 더 아름답게 출력하는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) {
        StringTokenizer(readLine()).run {
            val a = nextToken().toInt()
            val b = nextToken().toInt()

            writer.write("Case #$i: ${a + b}\n")
        }
    }

    writer.flush()
    writer.close()
    close()
}