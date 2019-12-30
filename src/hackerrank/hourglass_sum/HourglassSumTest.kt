package hackerrank.hourglass_sum

import org.junit.Assert.assertEquals
import org.junit.Test


class HourglassSum {

    @Test
    fun test1() {
        assertEquals(
            19,
            findMaxHourglassSum(
                arrayOf(
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 1, 0, 0, 0, 0),
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 0, 2, 4, 4, 0),
                    arrayOf(0, 0, 0, 2, 0, 0),
                    arrayOf(0, 0, 1, 2, 4, 0)
                )
            )
        )
    }

    @Test
    fun test2() {
        assertEquals(
            13,
            findMaxHourglassSum(
                arrayOf(
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 1, 0, 0, 0, 0),
                    arrayOf(1, 1, 1, 0, 0, 0),
                    arrayOf(0, 9, 2, -4, -4, 0),
                    arrayOf(0, 0, 0, -2, 0, 0),
                    arrayOf(0, 0, -1, -2, -4, 0)
                )
            )
        )
    }

    @Test
    fun test3() {
        assertEquals(
            28,
            findMaxHourglassSum(
                arrayOf(
                    arrayOf(-9, -9, -9, 1, 1, 1),
                    arrayOf(0, -9, 0, 4, 3, 2),
                    arrayOf(-9, -9, -9, 1, 2, 3),
                    arrayOf(0, 0, 8, 6, 6, 0),
                    arrayOf(0, 0, 0, -2, 0, 0),
                    arrayOf(0, 0, 1, 2, 4, 0)
                )
            )
        )
    }

    @Test
    fun test4() {
        assertEquals(
            -19,
            findMaxHourglassSum(
                arrayOf(
                    arrayOf(0, -4, -6, 0, -7, -6),
                    arrayOf(-1, -2, -6, -8, -3, -1),
                    arrayOf(-8, -4, -2, -8, -8, -6),
                    arrayOf(-3, -1, -2, -5, -7, -4),
                    arrayOf(-3, -1, -2, -5, -7, -4),
                    arrayOf(-3, -6, 0, -8, -6, -7)
                )
            )
        )
    }
}