package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.OddCompositeNumberSequence
import de.huddeldaddel.euler.math.isGoldbachNumber

fun main() {
    val sequence =  OddCompositeNumberSequence()
    var oddComposite = sequence.getNext()
    while(oddComposite.isGoldbachNumber()) {
        oddComposite = sequence.getNext()
    }
    println(oddComposite)
}
