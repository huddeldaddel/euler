package de.huddeldaddel.euler.sequences

class TriangleNumberSequence(var index: Int = 0) {

    fun getCurrent(): Long {
        return (index * (index +1L) / 2L)
    }

    fun getNext(): Long {
        index++
        return getCurrent()
    }

}
