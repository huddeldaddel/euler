package engineer.thomas_werner.euler

import java.util.*
import java.util.Calendar

fun main(args: Array<String>) {
    var problem19 = Problem19()
    println(problem19.countSundays())
}

class Problem19 {

    fun countSundays(): Int {
        var result = 0
        val end = GregorianCalendar(2001, Calendar.JANUARY, 1)
        var cal = GregorianCalendar(1901, Calendar.JANUARY, 1)
        while(cal.before(end)) {
            if((Calendar.SUNDAY == cal.get(Calendar.DAY_OF_WEEK) && (1 == cal.get(Calendar.DAY_OF_MONTH))))
                result++
            cal.add(Calendar.DAY_OF_MONTH, 1)
        }
        return result
    }

}