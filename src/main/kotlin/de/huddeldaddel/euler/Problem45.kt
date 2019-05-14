package de.huddeldaddel.euler

import de.huddeldaddel.euler.sequences.HexagonalNumberSequence
import de.huddeldaddel.euler.sequences.PentagonalNumberSequence
import de.huddeldaddel.euler.sequences.TriangleNumberSequence
import kotlin.system.exitProcess

/**
 * Solution for https://projecteuler.net/problem=45
 */
fun main() {
    val triangles = TriangleNumberSequence(285)
    val pentagons = PentagonalNumberSequence(165)
    val hexagons = HexagonalNumberSequence(143)
    while(true) {
        val hexagon = hexagons.getNext()
        while(hexagon > triangles.getCurrent()) {
            triangles.getNext()
        }
        if(hexagon == triangles.getCurrent()) {
            while (hexagon > pentagons.getCurrent()) {
                pentagons.getNext()
            }
            if(hexagon == pentagons.getCurrent()) {
                println(hexagon)
                exitProcess(0)
            }
        }

    }
}