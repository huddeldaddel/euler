package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.OddCompositeNumberSequence
import de.huddeldaddel.euler.math.PrimeSequence
import kotlin.math.sqrt

fun main() {
    val sequence =  OddCompositeNumberSequence()
    var oddComposite = sequence.getNext()
    while(isGoldbachNumber(oddComposite)) {
        oddComposite = sequence.getNext()
    }
    println(oddComposite)
}

fun isGoldbachNumber(input: Long): Boolean {
    for(i in 2..input) {
        if(PrimeSequence.isPrime(i)) {
            val possibleSquare = sqrt((input - i) / 2.0)
            if(possibleSquare.isInt()) {
                return true
            }
        }
    }
    return false
}