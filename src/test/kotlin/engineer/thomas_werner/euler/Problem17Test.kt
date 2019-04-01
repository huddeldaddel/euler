package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Problem17Test {

    var problem17: Problem17? = null

    @BeforeEach
    fun setUp() {
        problem17 = Problem17()
    }

    @Test
    fun testToString1() {
        Assertions.assertEquals("one", problem17?.toString(1))
    }

    @Test
    fun testToString10() {
        Assertions.assertEquals("ten", problem17?.toString(10))
    }

    @Test
    fun testToString11() {
        Assertions.assertEquals("eleven", problem17?.toString(11))
    }

    @Test
    fun testToString12() {
        Assertions.assertEquals("twelve", problem17?.toString(12))
    }

    @Test
    fun testToString15() {
        Assertions.assertEquals("fifteen", problem17?.toString(15))
    }

    @Test
    fun testToString20() {
        Assertions.assertEquals("twenty", problem17?.toString(20))
    }

    @Test
    fun testToString21() {
        Assertions.assertEquals("twenty-one", problem17?.toString(21))
    }

    @Test
    fun testToString22() {
        Assertions.assertEquals("twenty-two", problem17?.toString(22))
    }

    @Test
    fun testToString25() {
        Assertions.assertEquals("twenty-five", problem17?.toString(25))
    }

    @Test
    fun testToString115() {
        Assertions.assertEquals("one hundred and fifteen", problem17?.toString(115))
    }

    @Test
    fun testToString342() {
        Assertions.assertEquals(20, problem17?.countLetters("one hundred and fifteen"))
    }

    @Test
    fun testCountLetters115() {
        Assertions.assertEquals(23, problem17?.countLetters("three hundred and forty-two"))
    }

    @Test
    fun testCountLetters342() {
        Assertions.assertEquals(23, problem17?.countLetters("three hundred and forty-two"))
    }

    @Test
    fun testGetResult() {
        Assertions.assertEquals(19, problem17?.getResult(1..5))
    }

}