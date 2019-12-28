package base.quick_sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class QuickSortTest {

    @Test
    fun test1() {
        assertArrayEquals(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8),
            quickSort(arrayOf(7, 5, 2, 0, 4, 3, 6, 1, 8))
        )
    }
}