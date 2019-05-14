package de.huddeldaddel.euler.sequences

class OddCompositeNumberSequence(private var last: Long = 8) {

    fun getNext(): Long {
        last++
        while((last % 2 == 0L) || PrimeSequence.isPrime(last)) {
            last++
        }
        return last
    }

}