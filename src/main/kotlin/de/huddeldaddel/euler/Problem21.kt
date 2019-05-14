package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=21
 */
fun main() {
    var problem21 = Problem21()
    problem21.calculate()
    println(problem21.getAmicableNumberSum())
}

class Problem21 {

    private var amicableNumbers = mutableListOf<Boolean?>()

    fun calculate() {
        for(i in 0 until 10000)
            amicableNumbers.add(null)

        for(i in 1..9999) {
            if(null == amicableNumbers[i]) {
                val amicablePartner = getAmicableNumberPartner(i)
                if(null == amicablePartner) {
                    amicableNumbers[i] = false
                } else {
                    amicableNumbers[i] = true
                    amicableNumbers[amicablePartner] = true
                }
            }
        }
    }

    private fun getAmicableNumberPartner(number: Int): Int? {
        val numberSum = de.huddeldaddel.euler.math.Factorizer().getDivisors(number.toLong()).sum()
        val partnerSum = de.huddeldaddel.euler.math.Factorizer().getDivisors(numberSum).sum()
        return if(number.toLong() == partnerSum && (number != numberSum.toInt())) numberSum.toInt() else null
    }

    fun getAmicableNumberSum(): Long {
        var result = 0L
        for(i in 1..(amicableNumbers.size -1)) {
            if(true == amicableNumbers[i])
                result += i
        }
        return result
    }

}