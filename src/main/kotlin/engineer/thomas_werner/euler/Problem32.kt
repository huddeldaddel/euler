package engineer.thomas_werner.euler

fun main() {
    val products = mutableSetOf<Long>()

    for(a in 1..9_999) {
        for(b in 1..9_999) {
            val product = a.toLong() * b.toLong()
            if(listOf(a.toLong(), b.toLong(), product).isPandigital(9)) {
                println("$a * $b = $product")
                products.add(product)
            }
        }
    }
    println("Result: ${products.sum()}")
}

fun List<Long>.isPandigital(digits: Int): Boolean {
    var string = ""
    this.map { it.toString() }.forEach {string += it }

    if(digits != string.length)
        return false;

    for(i in 1..digits)
        if(!string.contains(i.toString()[0]))
            return false

    return true
}