package de.huddeldaddel.euler.extensions

import de.huddeldaddel.euler.isInt
import de.huddeldaddel.euler.math.Factorizer
import de.huddeldaddel.euler.math.Fraction
import de.huddeldaddel.euler.sequences.PrimeSequence
import de.huddeldaddel.euler.sequences.TriangleNumberSequence
import java.math.BigInteger
import kotlin.math.sqrt

fun Long.getPrimeFactors(): Collection<Long> {
    val result = mutableSetOf<Long>()
    Factorizer().getPrimeFactors(this, result)
    return result.filter { l -> l.isPrime() }
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

fun Long.isPermutationOf(other: Long) : Boolean {
    val thisString = this.toString()
    return thisString.all { c -> thisString.count { it == c } == other.toString().count { it == c } }
}

fun Long.isPrime(): Boolean {
    return PrimeSequence.isPrime(this)
}

fun Long.isTriangleNumber(): Boolean {
    val sequence = TriangleNumberSequence()
    var comp = sequence.getNext()
    while(this >= comp) {
        if(this == comp) {
            return true
        } else {
            comp = sequence.getNext()
        }
    }
    return false
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
