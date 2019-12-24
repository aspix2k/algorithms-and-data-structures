package problems.minimal_waiting_time

import org.junit.Test
import kotlin.test.assertEquals

class MinimalWaitingTimeTest {

    @Test
    fun test0() {
        assertEquals(
            0,
            findMinimalWaitingTime(arrayOf(100000))
        )
    }

    @Test
    fun test1() {
        assertEquals(
            20,
            findMinimalWaitingTime(arrayOf(3, 5, 2, 4, 1))
        )
    }

    @Test
    fun test2() {
        assertEquals(
            35,
            findMinimalWaitingTime(arrayOf(3, 5, 2, 4, 1, 6))
        )
    }
}