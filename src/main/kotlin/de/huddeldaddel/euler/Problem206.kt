package de.huddeldaddel.euler

import kotlin.system.exitProcess

/**
 * Solution for https://projecteuler.net/problem=206
 */
fun main() {
    val regex = "1\\d2\\d3\\d4\\d5\\d6\\d7\\d8\\d9\\d0".toRegex()
    (1_010_101_010L..1_389_026_623L).forEach {
        val square = it * it
        if(square.toString().matches(regex)) {
            println(it)
            exitProcess(0)
        }
    }
}