package engineer.thomas_werner.euler

fun main() {
    var number = constructIrrationalNumber(1_000_000)
    var result = 1
    listOf(number[0], number[9], number[99], number[999], number[9_999], number[99_999], number[999_999])
            .map { c -> c.toString().toInt() }
            .forEach { result *= it }
    println(result)
}

fun constructIrrationalNumber(length: Int): String {
    val result = StringBuilder()
    var num = 1
    while(result.length < length) {
        result.append(num++)
    }
    return result.toString()
}