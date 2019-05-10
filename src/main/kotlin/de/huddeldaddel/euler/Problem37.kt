package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.PrimeSequence

fun main() {
    var count = 0
    var sum = 0L
    var primeSequence = de.huddeldaddel.euler.math.PrimeSequence(10)
    while(count < 11) {
        val prime = primeSequence.nextValue()
        if(prime.isTruncatable()) {
            println("$prime is truncatable")
            count++
            sum += prime
        }
    }
    println("The result is $sum")
}

fun Long.isTruncatable(): Boolean {
    val string = this.toString()
    for(i in 1 until string.length) {
        val left = string.substring(i).toLong()
        if(!left.isPrime())
            return false

        val right = string.substring(0, string.length -i).toLong()
        if(!right.isPrime())
            return false
    }
    return true
}

fun Long.isPrime(): Boolean {
    return de.huddeldaddel.euler.math.PrimeSequence.isPrime(this)
}