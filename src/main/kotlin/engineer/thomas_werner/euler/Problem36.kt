package engineer.thomas_werner.euler

fun main() {
    var result = 0
    for(i in 1..1_000_000)
        if(isPalindrome(i.toString(2)) && isPalindrome(i.toString(10)))
            result += i
    println(result)
}

fun isPalindrome(s: String): Boolean {
    return s == s.reversed()
}