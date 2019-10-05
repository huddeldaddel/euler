package de.huddeldaddel.euler

import de.huddeldaddel.euler.extensions.isPrime
import de.huddeldaddel.euler.extensions.sumOfDigits
import java.math.BigInteger
import kotlin.system.measureTimeMillis

/**
 * Solution for https://projecteuler.net/problem=387
 */
class Problem387(private val upperBorder: BigInteger) {

    var result: BigInteger = BigInteger.ZERO

    fun compute(): BigInteger {
        result = BigInteger.ZERO
        (1..9).forEach { i -> buildNumbers(i.toBigInteger()) }
        return result
    }

    private fun buildNumbers(input: BigInteger) {
        (0..9).forEach { i ->
            val extended = BigInteger("$input$i")
            if(extended.isHarshad()) {
                if(extended.isStrong())
                    handlePrimeCandidate(extended)
                if(extended < upperBorder / BigInteger.TEN)
                    buildNumbers(extended)
            }
        }
    }

    private fun handlePrimeCandidate(input: BigInteger) {
        (0..9).forEach { i ->
            val extended = BigInteger("$input$i")
            if((extended < upperBorder) && extended.isPrime())
                result += extended
        }
    }

}

fun main() {
    println("Finished in ${measureTimeMillis { println(Problem387(BigInteger.TEN.pow(14)).compute()) }} milliseconds")
}

fun BigInteger.isHarshad(): Boolean {
    return BigInteger.ZERO == this.mod(this.sumOfDigits().toBigInteger())
}

fun BigInteger.isStrong(): Boolean {
    return (this / sumOfDigits().toBigInteger()).isPrime()
}
