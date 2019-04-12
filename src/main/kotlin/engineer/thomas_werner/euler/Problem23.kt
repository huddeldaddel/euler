package engineer.thomas_werner.euler

import engineer.thomas_werner.euler.math.Factorizer
import java.util.*

fun main(args: Array<String>) {
    val problem23 = Problem23()
    println(problem23.getNonAbundantSums())
}

class Problem23 {

    private val abundantNumbers = buildAbundantNumberMap()

    fun isAbundantNumberSum(number: Int): Boolean {
        for(i in 12..number) {
            if(abundantNumbers[i] && abundantNumbers[number -i])
                return true
        }
        return false
    }

    fun getNonAbundantSums(): Long {
        var result = 0L
        for(i in 1..20161)
            if(!isAbundantNumberSum(i))
                result += i
        return result
    }

    companion object {

        fun isAbundant(number: Int): Boolean {
            return Factorizer().getDivisors(number.toLong()).sum() > number
        }

        fun buildAbundantNumberMap(): BitSet {
            var result = BitSet(20162 )
            for(i in 1..20161)
                if(!result[i]) {
                    if(isAbundant(i)) {
                        result.flip(i)
                        for(j in (i+i)..result.length() step i)
                            result.flip(j)
                    }
                }
            return result
        }

    }

}