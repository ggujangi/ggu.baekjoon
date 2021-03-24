package hello_kotlin.c_for

import java.io.*
import java.util.*

/**
 * #11022 A+B - 8
 *
 * A+B를 바로 위 문제보다 아름답게 출력하는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) {
        StringTokenizer(readLine()).run {
            val a = nextToken().toInt()
            val b = nextToken().toInt()

            writer.write("Case #$i: $a + $b = ${a + b}\n")
        }
    }

    writer.flush()
    writer.close()
    close()
}