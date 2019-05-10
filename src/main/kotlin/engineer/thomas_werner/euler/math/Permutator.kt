package engineer.thomas_werner.euler.math

class Permutator {

    private fun <String> permute(list:List <String>):List<List<String>>{
        if(list.size==1)
            return listOf(list)
        val permutations = mutableListOf<List <String>>()
        val sub = list[0]
        for(permutation in permute(list.drop(1)))
            for (i in 0..permutation.size) {
                val newPermutation = permutation.toMutableList()
                newPermutation.add(i, sub)
                permutations.add(newPermutation)
            }
        return permutations
    }

    fun getPermutations(digits: String): List<String> {
        val list = digits.toCharArray().toMutableList()
        val permutations = permute(list)
        return permutations.map { it.joinToString("") }
    }

}