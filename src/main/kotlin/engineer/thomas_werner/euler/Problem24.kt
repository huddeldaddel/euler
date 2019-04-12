package engineer.thomas_werner.euler

fun main(args: Array<String>){
    println(Problem24().getMillionthPermutation())
}

class Problem24 {

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

    fun getMillionthPermutation(): String {
        val list = "0123456789".toCharArray().toMutableList()
        val permutations = Problem24().permute(list)
        val result = permutations
                .map { it.joinToString("") }
                .sorted()
        return result[999_999]
    }

}