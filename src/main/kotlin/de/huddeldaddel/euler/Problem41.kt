package de.huddeldaddel.euler

fun main() {
    for(i in 9_999_999 downTo 1 step 2) {
        val l = i.toLong()
        if(l.isPrime() && l.isPandigital()) {
            println(l)
            return
        }
    }
}

fun Long.isPandigital(): Boolean {
    val string = this.toString()
    if(9 < string.length) {
        return false;
    }

    for(i in 1..(string.length)) {
        if (!string.contains(i.toString()[0])) {
            return false
        }
    }
    return true
}