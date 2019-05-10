package engineer.thomas_werner.euler.math

class PentagonalNumberSequence(private var index: Int = 0) {

    fun getNext(): Long {
        index++
        return index * (3L * index -1L) / 2L
    }

}

fun Long.isPentagonalNumber(): Boolean {
    val sequence = PentagonalNumberSequence()
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