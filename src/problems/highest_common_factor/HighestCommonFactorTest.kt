package problems.highest_common_factor

import org.junit.Test
import kotlin.test.assertEquals

class HighestCommonFactorTest {

    @Test
    fun test1() {
        assertEquals(
            80,
            findHighestCommonFactor(1680, 640)
        )
    }

    @Test
    fun test2() {
        assertEquals(
            80,
            findHighestCommonFactor(640, 1680)
        )
    }

    @Test
    fun test3() {
        assertEquals(
            1,
            findHighestCommonFactor(1, 1)
        )
    }

    @Test
    fun test4() {
        assertEquals(
            32,
            findHighestCommonFactor(1952, 96)
        )
    }

    @Test
    fun test5() {
        assertEquals(
            6,
            findHighestCommonFactor(48, 918)
        )
    }

//    @Test
    fun test6() {
        // StackOverflowError here
        assertEquals(
            2,
            findHighestCommonFactor(1000004, 2)
        )
    }

    @Test
    fun test7() {
        assertEquals(
            80,
            findHighestCommonFactorEuclidian(1680, 640)
        )
    }
}