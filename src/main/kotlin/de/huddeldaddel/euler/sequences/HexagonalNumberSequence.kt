package de.huddeldaddel.euler.sequences

class HexagonalNumberSequence(var index: Int = 0) {

    fun getCurrent(): Long {
        return index * (2L * index -1L)
    }

    fun getNext(): Long {
        index++
        return getCurrent()
    }

}