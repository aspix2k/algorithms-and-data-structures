package hackerrank.jumping_on_the_clouds

import org.junit.Test
import kotlin.test.assertEquals

class JumpingOnTheCloudsTest {

    @Test
    fun test0() {
        assertEquals(
            2,
            findMinJumps(arrayOf(0, 1, 0, 1, 0))
        )
    }

    @Test
    fun test1() {
        assertEquals(
            4,
            findMinJumps(arrayOf(0, 0, 1, 0, 0, 1, 0))
        )
    }

    @Test
    fun test2() {
        assertEquals(
            3,
            findMinJumps(arrayOf(0, 0, 1, 0, 0))
        )
    }
}