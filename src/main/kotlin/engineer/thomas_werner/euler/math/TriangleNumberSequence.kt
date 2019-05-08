package engineer.thomas_werner.euler.math

class TriangleNumberSequence(private var index: Int = 0) {

    fun getNext(): Long {
        index++
        return (index * (index+1) / 2).toLong()
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