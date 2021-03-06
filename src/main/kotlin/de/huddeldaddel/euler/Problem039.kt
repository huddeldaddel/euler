package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=39
 */
fun main() {
    var maxCombinations = 0
    var result = 0
    for(p in 3..1000) {
        val combinations = mutableSetOf<String>()
        for(a in 1..p) {
            for(b in 1..p) {
                val c = calculateC(a, b)
                if(c.isInt() && (p == a + b + c.toInt())) {
                    combinations.add(normalizeResult(a, b, c.toInt()))
                }
            }
        }
        if(combinations.size > maxCombinations) {
            maxCombinations = combinations.size
            result = p
        }
    }
    println(result)
}

fun calculateC(a: Int, b: Int): Double {
    return Math.sqrt((a*a).toDouble() + b*b)
}

fun Double.isInt(): Boolean {
    return this.rem(1.0f) < 0.0000000000000001
}

fun normalizeResult(a: Int, b: Int, c: Int): String {
    val result = StringBuilder()
    listOf(a, b, c)
            .sorted()
            .map { i -> i.toString() }
            .forEach{ s -> result.append(s).append("+")}
    return result.toString().subSequence(0, result.length -1).toString()
}