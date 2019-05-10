package de.huddeldaddel.euler.math

class TriangleNumberSequence(var index: Int = 0) {

    fun getCurrent(): Long {
        return (index * (index +1L) / 2L)
    }

    fun getNext(): Long {
        index++
        return getCurrent()
    }

}

fun Long.isTriangleNumber(): Boolean {
    val sequence = TriangleNumberSequence()
    var comp = sequence.getNext()
    while(this >= comp) {
        if(this == comp) {
            return true
        } else {
            comp = sequence.getNext()
        }
    }
    return false
}