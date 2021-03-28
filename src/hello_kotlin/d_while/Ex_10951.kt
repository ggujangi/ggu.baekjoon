package hello_kotlin.d_while

import java.io.*
import java.util.*

/**
 * #10951 A+B - 4
 *
 * 입력이 끝날 때까지 A+B를 출력하는 문제. EOF에 대해 알아 보세요.
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var s: String?

    while (readLine().also { s = it } != null) {
        val tokenizer = StringTokenizer(s)
        val a = tokenizer.nextToken().toInt()
        val b = tokenizer.nextToken().toInt()
        writer.write("${a + b}\n")
    }

    writer.flush()
    writer.close()
    close()
}