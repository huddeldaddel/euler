package de.huddeldaddel.euler

import de.huddeldaddel.euler.util.NumberMatrixResourceLoader
import kotlin.math.min
import kotlin.system.measureTimeMillis

/**
 * Solution for https://projecteuler.net/problem=81
 */
fun main() {
    val problem81 = Problem81(NumberMatrixResourceLoader().loadMatrix("81.txt"))
    println("Finished in ${measureTimeMillis { println(problem81.findMinimalPathSum()) }} milliseconds")
}

class Problem81(var matrix: MutableList<MutableList<Long>>) {

    fun findMinimalPathSum(): Long {
        for(row in matrix.size -1 downTo 0) {
            for(column in matrix[row].size -1 downTo 0) {
                updateCell(row, column)
            }
        }
        return matrix[0][0]
    }

    private fun updateCell(row: Int, column: Int) {
        if(row != matrix.size -1 || column != matrix[row].size -1) {
            val right = if (column == matrix[row].size - 1) Long.MAX_VALUE else matrix[row][column + 1]
            val bottom = if (row == matrix.size - 1) Long.MAX_VALUE else matrix[row + 1][column]
            matrix[row][column] += min(right, bottom)
        }
    }

}