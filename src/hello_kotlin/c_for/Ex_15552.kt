package hello_kotlin.c_for


import java.io.*
import java.util.*

/**
 * #15552 빠른 A+B
 *
 * 빠르게 입력받고 출력하는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1..readLine().toInt()) {
        StringTokenizer(readLine()).run {
            val a = nextToken().toInt()
            val b = nextToken().toInt()

            writer.write("${a + b}\n")
        }
    }

    writer.flush()
    writer.close()
    close()
}