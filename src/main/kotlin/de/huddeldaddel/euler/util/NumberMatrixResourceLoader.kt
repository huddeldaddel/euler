package de.huddeldaddel.euler.util

import java.io.InputStreamReader

class NumberMatrixResourceLoader {

    fun loadMatrix(fileName: String): MutableList<MutableList<Long>> {
        NumberMatrixResourceLoader::class.java.getResourceAsStream("/de/huddeldaddel/euler/$fileName").use {
            InputStreamReader(it).useLines { sequence ->
                return sequence.map { line ->
                    line.split(',', ignoreCase = false).map { s -> s.toLong() }.toMutableList()
                }.toMutableList()
            }
        }
    }

}