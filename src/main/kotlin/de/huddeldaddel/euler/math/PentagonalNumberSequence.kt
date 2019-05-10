package de.huddeldaddel.euler.math

class PentagonalNumberSequence(var index: Int = 0) {

    fun getCurrent(): Long {
        return index * (3L * index -1L) / 2L
    }

    fun getNext(): Long {
        index++
        return getCurrent()
    }

}
