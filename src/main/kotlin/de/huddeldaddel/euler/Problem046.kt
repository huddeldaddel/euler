package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.OddCompositeNumberSequence
import de.huddeldaddel.euler.extensions.isGoldbachNumber

/**
 * Solution for https://projecteuler.net/problem=46
 */
fun main() {
    val sequence = OddCompositeNumberSequence()
    var oddComposite = sequence.getNext()
    while(oddComposite.isGoldbachNumber()) {
        oddComposite = sequence.getNext()
    }
    println(oddComposite)
}
