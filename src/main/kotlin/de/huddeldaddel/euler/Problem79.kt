package de.huddeldaddel.euler

fun main() {
    println(Problem79().digits)
}

class Problem79(var digits: String = "") {

    init {
        digits = getUnsortedDigits()
        INPUT.forEach { reorder(it) }
    }

    private fun getUnsortedDigits(): String {
        val result = mutableSetOf<String>()
        INPUT.forEach { it.forEach { c -> result.add(c.toString()) } }
        return result.joinToString(separator = "")
    }

    private fun reorder(digitSequence: String) {
        val buffer = StringBuilder(digits)
        for(i in 0..1) {
            val leftIdx = buffer.indexOf(digitSequence.substring(i..i))
            val rightIdx = buffer.indexOf(digitSequence.substring((i+1)..(i+1)))
            if(leftIdx > rightIdx) {
                buffer.setCharAt(leftIdx, digitSequence[i+1])
                buffer.setCharAt(rightIdx, digitSequence[i])
            }
        }
        digits = buffer.toString()
    }

    companion object {

        val INPUT = listOf(
                "319", "680", "180", "690", "129", "620", "762", "689", "762", "318", "368", "710", "720", "710", "629",
                "168", "160", "689", "716", "731", "736", "729", "316", "729", "729", "710", "769", "290", "719", "680",
                "318", "389", "162", "289", "162", "718", "729", "319", "790", "680", "890", "362", "319", "760", "316",
                "729", "380", "319", "728", "716")

    }

}