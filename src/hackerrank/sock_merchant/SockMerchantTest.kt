package hackerrank.sock_merchant

import org.junit.Assert.assertEquals
import org.junit.Test

class SockMerchantTest {

    @Test
    fun test0() {
        assertEquals(
            0,
            findMaximumPairsOfSocks(arrayOf())
        )
    }

    @Test
    fun test1() {
        assertEquals(
            3,
            findMaximumPairsOfSocks(arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
        )
    }

    @Test
    fun test2() {
        assertEquals(
            0,
            findMaximumPairsOfSocks(arrayOf(10, 20, -50, 40, 0, 30, 10000000))
        )
    }
}