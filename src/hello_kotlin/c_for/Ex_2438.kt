package hello_kotlin.c_for

import java.io.*

/**
 * #2438 별 찍기 - 1
 *
 * 별을 찍는 문제 1
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    for (i in 1..readLine().toInt()) {
        for (j in 1..i) {
            writer.write("*")
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
    close()
}