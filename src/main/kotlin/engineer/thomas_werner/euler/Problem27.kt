package engineer.thomas_werner.euler

import engineer.thomas_werner.euler.math.PrimeSequence

fun main(args: Array<String>) {
    println(Problem27().getResult())
}

class Problem27 {

    fun getResult(): Int {
        var maxPrimes = 0L
        var resultA = 0
        var resultB = 0
        for(a in -1_000..1000) {
            for(b in -1_000..1000) {
                val r = getConsecutivePrimes(a, b)
                if(r > maxPrimes) {
                    maxPrimes = r
                    resultA = a
                    resultB = b
                }
            }
            println("$a: $maxPrimes $resultA $resultB")
        }
        return resultA * resultB
    }

    companion object {

        fun getConsecutivePrimes(a: Int, b: Int): Long {
            var n=0L
            while(isPrime(n, a, b))
                n++
            return n
        }

        fun isPrime(n: Long, a: Int, b: Int): Boolean {
            return PrimeSequence.isPrime(n*n + a*n +b)
        }

    }

}