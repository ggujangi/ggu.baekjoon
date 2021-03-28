package hello_kotlin.e_array

import java.io.*
import java.util.*

/**
 * #10818 최소, 최대
 *
 * 최솟값과 최댓값을 찾는 문제
 */

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val array = IntArray(n)

    StringTokenizer(readLine()).run {
        for (i in 0 until n) {
            array[i] = nextToken().toInt()
        }
    }

    writer.write("${Arrays.stream(array).min().asInt} ${Arrays.stream(array).max().asInt}")
    writer.flush()
    writer.close()
    close()
}