package hello_kotlin.c_for

import java.io.*

/**
 * #2439 별 찍기 - 2
 *
 * 별을 찍는 문제 2
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()

    for (i in 1..n) {
        for (j in n downTo 1) {
            writer.write(
                if (i >= j) "*"
                else " "
            )
        }
        writer.write("\n")
    }

    writer.flush()
    writer.close()
    close()
}