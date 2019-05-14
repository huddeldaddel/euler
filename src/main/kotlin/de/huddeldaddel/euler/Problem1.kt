package de.huddeldaddel.euler

/**
 * Solution for https://projecteuler.net/problem=1
 */
fun main() {
    println((0..999).filter { (0 == it % 3 || 0 == it % 5) }.sum())
}
