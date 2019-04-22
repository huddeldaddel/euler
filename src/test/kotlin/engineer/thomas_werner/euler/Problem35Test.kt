package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class Problem35Test {

    @Test
    fun testIsPrime() {
        Assertions.assertEquals(true, 2L.isCircularPrime())
        Assertions.assertEquals(false, 6L.isCircularPrime())
        Assertions.assertEquals(false, 93L.isCircularPrime())
        Assertions.assertEquals(true, 97L.isCircularPrime())
        Assertions.assertEquals(true, 197L.isCircularPrime())
    }

}