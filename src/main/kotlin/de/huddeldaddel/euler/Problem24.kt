package de.huddeldaddel.euler

import de.huddeldaddel.euler.math.Permutator

fun main(){
    println(Problem24().getMillionthPermutation())
}

class Problem24 {

    fun getMillionthPermutation(): String {
        return Permutator()
                .getPermutations("0123456789")
                .sorted()[999_999]
    }

}