package de.huddeldaddel.euler.util

import java.io.BufferedReader
import java.io.InputStreamReader

class ResourceLoader {

    /**
     * Returns a triple of line #, base, exponent
     */
    fun loadNumbersWithExponentsAndIndex(fileName: String): List<Triple<Int, Long, Int>> {
        object {}.javaClass.getResourceAsStream("/de/huddeldaddel/euler/$fileName").use {
            BufferedReader(InputStreamReader(it)).useLines { sequence ->
                return sequence.mapIndexed { index, s -> run {
                    val parts = s.split(',', ignoreCase = true)
                    Triple(index + 1, parts[0].toLong(), parts[1].toInt())
                } }.toList()
            }
        }
    }

    fun loadMatrix(fileName: String): MutableList<MutableList<Long>> {
        ResourceLoader::class.java.getResourceAsStream("/de/huddeldaddel/euler/$fileName").use {
            InputStreamReader(it).useLines { sequence ->
                return sequence.map { line ->
                    line.split(',', ignoreCase = false).map { s -> s.toLong() }.toMutableList()
                }.toMutableList()
            }
        }
    }

}