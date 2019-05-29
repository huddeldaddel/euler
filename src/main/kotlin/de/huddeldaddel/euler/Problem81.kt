package de.huddeldaddel.euler

import java.io.InputStreamReader
import kotlin.math.min
import kotlin.system.measureTimeMillis

/**
 * Solution for https://projecteuler.net/problem=81
 */
fun main() {
    val problem81 = Problem81(Problem81.loadMatrix("81.txt"))
    println("Finished in ${measureTimeMillis { println(problem81.findMinimalPathSum()) }} milliseconds")
}

class Problem81(var matrix: MutableList<MutableList<Long>>) {

    fun findMinimalPathSum(): Long {
        for(row in matrix.size -1 downTo 0) {
            for(column in matrix[row].size -1 downTo 0) {
                if(row != matrix.size -1 || column != matrix[row].size -1) {
                    val right = if (column == matrix[row].size - 1) Long.MAX_VALUE else matrix[row][column + 1]
                    val bottom = if (row == matrix.size - 1) Long.MAX_VALUE else matrix[row + 1][column]
                    matrix[row][column] += min(right, bottom)
                }
            }
        }
        return matrix[0][0]
    }

    companion object {

        fun loadMatrix(fileName: String): MutableList<MutableList<Long>> {
            Problem81::class.java.getResourceAsStream("/de/huddeldaddel/euler/$fileName").use {
                InputStreamReader(it).useLines { sequence ->
                    return sequence.map { line ->
                        line.split(',', ignoreCase = false).map { s -> s.toLong() }.toMutableList()
                    }.toMutableList()
                }
            }
        }

    }

}