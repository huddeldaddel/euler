package engineer.thomas_werner.euler

fun main() {
    val problem38 = Problem38()
    println(problem38.findBiggestPandigital())
}

class Problem38(private var biggestPandigital: Long = 0L) {

    fun findBiggestPandigital(): Long {
        var integer = 1
        while(true) {
            var concatenation = ""
            var n = 1
            while(concatenation.length < 9) {
                concatenation += (integer * n++).toString()
                if(9 == concatenation.length) {
                    val longVal = concatenation.toLong()
                    if(listOf(longVal).isPandigital(9) && longVal > biggestPandigital) {
                        biggestPandigital = longVal
                    }
                }

                if(3 == n && concatenation.length > 9) {
                    return biggestPandigital
                }
            }
            integer++
        }
    }

}