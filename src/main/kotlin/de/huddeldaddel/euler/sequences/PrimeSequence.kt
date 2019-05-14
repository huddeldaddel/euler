package de.huddeldaddel.euler.sequences

class PrimeSequence {

    private var lastNum: Long = 0

    constructor() {
        lastNum = 1
    }

    constructor(initialValue: Long) {
        lastNum = initialValue
    }

    fun nextValue(): Long {
        while (!isPrime(++lastNum));
        return lastNum
    }

    companion object {

        fun isPrime(number: Long): Boolean {
            if (number < 2)
                return false

            if (0L == number % 2)
                return number == 2L

            var l: Long = 3
            while (l * l <= number) {
                if (0L == number % l)
                    return false
                l += 2
            }

            return true
        }
    }

}
