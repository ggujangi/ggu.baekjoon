package hello_kotlin.d_while

import java.io.*
import java.util.*

/**
 * #10952 A+B - 5
 *
 * 0 0이 들어올 때까지 A+B를 출력하는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val tokenizer = StringTokenizer(readLine())

        val a = tokenizer.nextToken().toInt()
        val b = tokenizer.nextToken().toInt()

        if (a == 0 && b == 0) break
        writer.write("${a + b}\n")
    }

    writer.flush()
    writer.close()
    close()
}