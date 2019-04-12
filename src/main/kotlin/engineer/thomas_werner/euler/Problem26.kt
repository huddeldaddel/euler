package engineer.thomas_werner.euler

import java.lang.ArithmeticException
import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext
import java.math.RoundingMode

fun main() {
    println(Problem26().getDemoninatorWithMaxCycle())
}

class Problem26 {

    fun getDemoninatorWithMaxCycle(): Int {
        var maxCycleLength = 0
        var denominator = 0
        for(d in 1 until 1000) {
            val nthUnitFraction = getNthUnitFraction(d)
            val recurringCycle = getRecurringCycle(nthUnitFraction)
            if((null != recurringCycle) && (recurringCycle.length > maxCycleLength)) {
                denominator = d
                maxCycleLength = recurringCycle.length
            }
        }
        return denominator
    }

    companion object {

        fun getRecurringCycle(input: String): String? {
            // TODO
            return null
        }

        fun getNthUnitFraction(n: Int): String {
            val numerator = BigDecimal.ONE
            val denominator = BigDecimal(BigInteger.valueOf(n.toLong()))
            return try {
                // Try to get the shortest value possible
                numerator.divide(denominator, MathContext.UNLIMITED).toPlainString()
            } catch(ae: ArithmeticException) {
                // A recurring cycle: calculation restricted to 10_000 decimal places
                numerator.divide(denominator,10_000, RoundingMode.HALF_UP).toPlainString()
            }
        }

    }

}