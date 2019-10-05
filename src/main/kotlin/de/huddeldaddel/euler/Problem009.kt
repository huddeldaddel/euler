package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=9
 */
fun main() {
    println(Problem9().findPythagoreanTriplet())
}

class Problem9 {

    fun findPythagoreanTriplet(): Long {
        for (c in 1..999)
            for (b in 1 until c)
                for (a in 1 until b)
                    if (isPythagoreanTriplet(a, b, c) && isTargetTriplet(a, b, c))
                        return getResult(a, b, c)
        return 0
    }

    private fun isPythagoreanTriplet(a: Int, b: Int, c: Int): Boolean {
        return a < b && b < c && a * a + b * b == c * c
    }

    private fun isTargetTriplet(a: Int, b: Int, c: Int): Boolean {
        return 1000 == a + b + c
    }

    private fun getResult(a: Int, b: Int, c: Int): Long {
        println("a: $a, b: $b, c: $c")
        return (a * b * c).toLong()
    }

}
