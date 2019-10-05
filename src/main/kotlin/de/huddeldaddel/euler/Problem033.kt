package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=33
 */
fun main() {
    for(denominator in 11..99)
        for(numerator in 10 until denominator)
            checkFraction(denominator, numerator)

    // This just prints the four fractions. I did the rest of the calculation on paper.
}

fun checkFraction(denominator: Int, numerator: Int) {
    val value = numerator.toDouble() / denominator.toDouble()
    numerator.toString().forEach {
        if((it != '0') && denominator.toString().contains(it)) {
            val simplifiedNumerator = numerator.toString().replaceFirst(it.toString(), "").toInt()
            val simplifiedDenominator = denominator.toString().replaceFirst(it.toString(), "").toInt()
            val compValue = simplifiedNumerator.toDouble() / simplifiedDenominator.toDouble()
            if(Math.abs(value - compValue) < 0.000000001) {
                println("$numerator / $denominator = $simplifiedNumerator / $simplifiedDenominator")
            }
        }
    }
}