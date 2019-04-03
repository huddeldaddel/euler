package engineer.thomas_werner.euler

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Problem18Test {

    @Test
    fun testGetMaximumPathSumExample() {
        var problem18 = Problem18("""3
7 4
2 4 6
8 5 9 3""".trimIndent())
        Assertions.assertEquals(23, problem18.getMaximumPathSum())
    }

}