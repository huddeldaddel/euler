package de.huddeldaddel.euler

import de.huddeldaddel.euler.extensions.isPrime

/**
 * Solution for https://projecteuler.net/problem=58
 */
fun main() {
    val numberSpiral = NumberSpiral()
    numberSpiral.increaseSize()
    while(numberSpiral.getRatioOfDiagonalPrimes() > 0.1f) {
        numberSpiral.increaseSize()
    }
    println(numberSpiral.getWidth())
}

class NumberSpiral(private var size: Int = 0,
                   private var primeCount: Int = 0,
                   private var topLeftPrime: Long = 1L) {

    fun increaseSize() {
        size++
        val l = size * 2L
        for(i in 1..4) {
            if((topLeftPrime + l*i).isPrime()) {
                primeCount++
            }
        }
        topLeftPrime += l*4
    }

    fun getRatioOfDiagonalPrimes() : Float {
        val numbersOnDiagonals = getWidth() * 2 - 1
        return primeCount.toFloat() / numbersOnDiagonals
    }

    fun getWidth(): Int {
        return size * 2 +1
    }

}