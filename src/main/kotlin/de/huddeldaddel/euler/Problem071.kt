package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.Fraction
import de.huddeldaddel.euler.math.FractionComparator
import kotlin.streams.toList

fun main() {
    val limit = 1_000_000L
    val elements = (3L..limit).toList().stream()
            .parallel()
            .map { l -> getFractionClosestTo3Div7(l) }
            .toList().toSet().stream()
            .sorted(FractionComparator())
            .toList()

    val referenceIndex = elements.indexOf(Fraction(3L, 7L))
    val resultFraction = elements[referenceIndex -1]
    println(resultFraction)
}

fun getFractionClosestTo3Div7(denominator: Long): Fraction {
    val threeSeventh = Fraction(3L, 7L)
    var lastFraction = Fraction(1L, denominator)
    for(n in (3L * (denominator / 7L)) until denominator) {
        val fraction = Fraction(n, denominator)
        if(threeSeventh < fraction) {
            return lastFraction.reduce()
        } else lastFraction = fraction
    }
    throw ArithmeticException("Unable to find fraction")
}