package engineer.thomas_werner.euler.math

class PentagonalNumberSequence(private var index: Int = 0) {

    fun getNext(): Long {
        index++
        return index * (3L * index -1L) / 2L
    }

}
