package hackerrank.counting_valleys

import org.junit.Test
import kotlin.test.assertEquals

class CountingValleysTest {

    @Test
    fun test0() {
        assertEquals(
            0,
            countValleys("")
        )
    }

    @Test
    fun test1() {
        assertEquals(
            1,
            countValleys("UDDDUDUU")
        )
    }

    @Test
    fun test2() {
        assertEquals(
            2,
            countValleys("DDUUUDUDDDD")
        )
    }

    @Test
    fun test3() {
        assertEquals(
            1,
            countValleys("DDDDDDDD")
        )
    }

    @Test
    fun test4() {
        assertEquals(
            2,
            countValleys("DDUUDDUDUUUD")
        )
    }
}