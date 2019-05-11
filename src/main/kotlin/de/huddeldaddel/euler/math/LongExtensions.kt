package de.huddeldaddel.euler.math

import de.huddeldaddel.euler.isInt
import kotlin.math.sqrt

fun Long.getPrimeFactors(): Collection<Long> {
    val result = mutableSetOf<Long>()
    Factorizer().getPrimeFactors(this, result)
    return result
}

fun Long.isGoldbachNumber(): Boolean {
    for(i in 2..this) {
        if(PrimeSequence.isPrime(i)) {
            val possibleSquare = sqrt((this - i) / 2.0)
            if(possibleSquare.isInt()) {
                return true
            }
        }
    }
    return false
}

fun Long.isPandigital(): Boolean {
    val string = this.toString()
    if(9 < string.length) {
        return false;
    }

    for(i in 1..(string.length)) {
        if (!string.contains(i.toString()[0])) {
            return false
        }
    }
    return true
}

fun Long.isPrime(): Boolean {
    return PrimeSequence.isPrime(this)
}

fun Long.isTruncatable(): Boolean {
    val string = this.toString()
    for(i in 1 until string.length) {
        val left = string.substring(i).toLong()
        if(!left.isPrime())
            return false

        val right = string.substring(0, string.length -i).toLong()
        if(!right.isPrime())
            return false
    }
    return true
}
