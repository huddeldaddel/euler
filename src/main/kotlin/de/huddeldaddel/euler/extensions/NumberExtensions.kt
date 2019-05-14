package de.huddeldaddel.euler.extensions

fun Number.isPalindrome(): Boolean {
    return this.toString() == this.toString().reversed()
}