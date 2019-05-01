package engineer.thomas_werner.euler

fun main() {
    val problem38 = Problem38()
    println(problem38.findBiggestPandigital())
}

class Problem38(private var biggestPandigital: Long = 0L) {

    fun findBiggestPandigital(): Long {
        var integer = 1
        while(!isBiggestPandigitalFound(integer)) {
            integer++
        }
        return biggestPandigital
    }

    private fun isBiggestPandigitalFound(integer: Int): Boolean {
        var concatenation = ""
        var n = 1
        while (concatenation.length < 9) {
            concatenation += (integer * n++).toString()
            updateResultIfPandigital(concatenation)
            if (3 == n && concatenation.length > 9) {
                return true
            }
        }
        return false
    }

    private fun updateResultIfPandigital(concatenation: String) {
        if (9 == concatenation.length) {
            val longVal = concatenation.toLong()
            if (listOf(longVal).isPandigital(9) && longVal > biggestPandigital) {
                biggestPandigital = longVal
            }
        }
    }

}