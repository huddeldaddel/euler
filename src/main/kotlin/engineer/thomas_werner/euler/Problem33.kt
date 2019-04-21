package engineer.thomas_werner.euler

fun main() {
    for(denominator in 11..99)
        for(numerator in 10 until denominator) {
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

    // I did the rest of the calculation on paper.
    // Here is how to do it:
    // 
    // 1: find the multiply the identified numbers
    // 2: simplify the result
}