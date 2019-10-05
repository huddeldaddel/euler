package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=15
 */
fun main() {
    val problem15 = Problem15(20)
    println(problem15.countRoutes())
}

data class Problem15(val size: Int) {

    private var count: Long = 0;

    fun canGoDown(y: Int): Boolean {
        return y < size;
    }

    fun canGoRight(x: Int): Boolean {
        return x < size;
    }

    fun countRoutes() : Long {
        count = 0
        traverse(0, 0)
        return count
    }

    fun traverse(x: Int, y: Int) {
        if(canGoDown(y))
            traverse(x, y +1)
        if(canGoRight(x))
            traverse(x +1, y)
        if(!(canGoRight(x) || canGoDown(y)))
            count++
    }

}