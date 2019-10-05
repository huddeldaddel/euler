package de.huddeldaddel.euler

import java.lang.IllegalArgumentException

/**
 * Solution for https://projecteuler.net/problem=17
 */
fun main() {
    val problem17 = Problem17()
    println(problem17.getResult(1..1000))
}

class Problem17 {

    fun getResult(range: IntRange): Int {
        var result = 0
        for(i in range) {
            result += countLetters(toString(i))
        }
        return result
    }

    fun countLetters(input: String): Int {
        return input.filter { it != ' ' && it != '-' }.count()
    }

    fun toString(number: Int): String {
        when {
            number < 10 -> return digitToString(number)
            number < 20 -> return tensToString(number)
            number < 100 -> {
                val x = tenTimesOneToString(number / 10)
                return if(0 == number % 10)
                    x
                else
                    "$x-${digitToString(number % 10)}"
            }
            number < 1000 -> {
                val a = digitToString(number / 100) + " hundred"
                return if(0 == number % 100)
                    a
                else
                    "$a and ${toString(number % 100)}"
            }
            number == 1000 -> return "one thousand"
            else -> throw NotImplementedError(":(")
        }
    }

    private fun digitToString(digit: Int) : String {
        when(digit) {
            0 -> return "zero"
            1 -> return "one"
            2 -> return "two"
            3 -> return "three"
            4 -> return "four"
            5 -> return "five"
            6 -> return "six"
            7 -> return "seven"
            8 -> return "eight"
            9 -> return "nine"
        }
        throw IllegalArgumentException("$digit is not a valid digit")
    }

    private fun tensToString(number: Int) : String {
        when(number) {
            10 -> return "ten"
            11 -> return "eleven"
            12 -> return "twelve"
            13 -> return "thirteen"
            14 -> return "fourteen"
            15 -> return "fifteen"
            16 -> return "sixteen"
            17 -> return "seventeen"
            18 -> return "eighteen"
            19 -> return "nineteen"
        }
        throw IllegalArgumentException("$number is not a valid digit")
    }

    private fun tenTimesOneToString(number: Int): String {
        when(number) {
            0 -> return ""
            1 -> return ""
            2 -> return "twenty"
            3 -> return "thirty"
            4 -> return "forty"
            5 -> return "fifty"
            6 -> return "sixty"
            7 -> return "seventy"
            8 -> return "eighty"
            9 -> return "ninety"
        }
        throw IllegalArgumentException("$number is not a valid digit")
    }

}