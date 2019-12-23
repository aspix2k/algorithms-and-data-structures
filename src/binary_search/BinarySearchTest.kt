package binary_search

import org.junit.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun test1() {
        assertEquals(
            5,
            binarySearch(arrayOf("aa", "ab", "ac", "ad", "ae", "af", "ag", "ah"), "af")
        )
    }

    @Test
    fun test2() {
        assertEquals(
            1,
            binarySearch(arrayOf("a", "b", "c", "d", "e", "f", "g", "h"), "b")
        )
    }
}