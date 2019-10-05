package de.huddeldaddel.euler.extensions

fun Number.isPalindrome(): Boolean {
    return this.toString() == this.toString().reversed()
}

fun Number.sumOfDigits(): Long {
    return this.toString().map { c -> c.toString().toLong() }.sum()
}
