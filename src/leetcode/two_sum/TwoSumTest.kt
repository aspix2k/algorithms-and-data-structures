package leetcode.two_sum

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TwoSumTest {

    @Test
    fun test0() {
        assertArrayEquals(
            intArrayOf(0, 1),
            twoSum(
                nums = intArrayOf(2, 7, 11, 15),
                target = 9
            )
        )
    }
}