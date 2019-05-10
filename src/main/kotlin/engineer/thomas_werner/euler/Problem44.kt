package engineer.thomas_werner.euler

import engineer.thomas_werner.euler.math.PentagonalNumberSequence
import kotlin.math.absoluteValue

fun main() {
    val sequence = PentagonalNumberSequence()
    val pentagonals = (1..10_000).map{ sequence.getNext() }
    for(i in 0 until 10_000) {
        for (j in 0 until 10_000) {
            if (i != j) {
                val sum = pentagonals[i] + pentagonals[j]
                val dif = pentagonals[j] - pentagonals[i]
                if (pentagonals.contains(sum) && pentagonals.contains(dif)) {
                    println("${dif.absoluteValue}: ${pentagonals[i]} / ${pentagonals[j]}")
                }
            }
        }
    }
}