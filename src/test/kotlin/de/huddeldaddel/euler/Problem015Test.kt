import de.huddeldaddel.euler.Problem15
import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class Problem015Test {

    @Test
    fun testGetSize() {
        val problem15 = Problem15(2)
        Assertions.assertEquals(2, problem15.size)
    }

    @Test
    fun testCanGoDown() {
        val problem15 = Problem15(2)

        Assertions.assertEquals(true, problem15.canGoDown(0))
        Assertions.assertEquals(true, problem15.canGoDown(1))
        Assertions.assertEquals(false, problem15.canGoDown(2))
    }

    @Test
    fun testCanGoRight() {
        val problem15 = Problem15(2)

        Assertions.assertEquals(true, problem15.canGoRight(0))
        Assertions.assertEquals(true, problem15.canGoRight(1))
        Assertions.assertEquals(false, problem15.canGoRight(2))
    }

    @Test
    fun testCountRoutes() {
        val problem15 = Problem15(2)
        Assertions.assertEquals(6, problem15.countRoutes())
    }

}