package de.huddeldaddel.euler.math

fun Number.isPalindrome(): Boolean {
    return this.toString() == this.toString().reversed()
}