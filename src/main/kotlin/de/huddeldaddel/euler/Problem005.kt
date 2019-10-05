package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=5
 */
fun main() {
    println(Problem5().getSmallestMultiple(20))
}

class Problem5 {

    fun getSmallestMultiple(d: Int): Long {
        var result: Long = 0
        var failed = true

        while (failed) {
            result += d.toLong()
            failed = false
            for (i in 1..d) {
                if (0L != result % i) {
                    failed = true
                    break
                }
            }
        }

        return result
    }

}
