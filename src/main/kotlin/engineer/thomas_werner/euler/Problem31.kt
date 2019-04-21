package engineer.thomas_werner.euler

fun main() {
    var result = 1
    for(onePound in 0..2)
        for(fiftyPence in 0..4)
            for(twentyPence in 0..10)
                for(tenPence in 0..20)
                    for(fivePence in 0..40)
                        for(twoPence in 0..100)
                            for(onePence in 0..200) {
                                val sum = onePound * 100 +
                                        fiftyPence * 50 +
                                        twentyPence * 20 +
                                        tenPence * 10 +
                                        fivePence * 5 +
                                        twoPence * 2 +
                                        onePence
                                if(200 == sum)
                                    result++
                            }
    println(result)
}