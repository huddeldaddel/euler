package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem17Test {

    private val problem17 = Problem17()

    @Test
    fun testToString() {
        Assertions.assertEquals("one", problem17.toString(1))
        Assertions.assertEquals("ten", problem17.toString(10))
        Assertions.assertEquals("eleven", problem17.toString(11))
        Assertions.assertEquals("twelve", problem17.toString(12))
        Assertions.assertEquals("fifteen", problem17.toString(15))
        Assertions.assertEquals("twenty", problem17.toString(20))
        Assertions.assertEquals("twenty-one", problem17.toString(21))
        Assertions.assertEquals("twenty-two", problem17.toString(22))
        Assertions.assertEquals("twenty-five", problem17.toString(25))
        Assertions.assertEquals("one hundred and fifteen", problem17.toString(115))
        Assertions.assertEquals(20, problem17.countLetters("one hundred and fifteen"))
    }

    @Test
    fun testCountLetters() {
        Assertions.assertEquals(23, problem17.countLetters("three hundred and forty-two"))
        Assertions.assertEquals(23, problem17.countLetters("three hundred and forty-two"))
    }

    @Test
    fun testGetResult() {
        Assertions.assertEquals(19, problem17.getResult(1..5))
    }

}