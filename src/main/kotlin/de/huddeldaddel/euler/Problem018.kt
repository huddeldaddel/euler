package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=18
 */
fun main() {
    var problem18 = Problem18("""75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23""".trimIndent())
    println(problem18.getMaximumPathSum())
}

class Problem18 {

    private var triangle: List<MutableList<Int>>

    constructor(input: String) {
        val lines = input.split("\n")
        triangle = lines.map { line -> line.split(" ").map { num -> num.toInt() }.toMutableList() }
    }

    fun getMaximumPathSum(): Int {
        val size = triangle.size -1
        for(rowIdx in size downTo 1) {
            for(colIdx in 0 until triangle[rowIdx].size -1) {
                val oldValue = triangle[rowIdx -1][colIdx]
                val maxVal = listOf(triangle[rowIdx][colIdx], triangle[rowIdx][colIdx +1]).max()
                triangle[rowIdx -1][colIdx] = oldValue + (maxVal ?: -1)
            }
        }
        return triangle[0][0]
    }

}