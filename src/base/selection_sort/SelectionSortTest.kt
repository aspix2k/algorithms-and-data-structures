package base.selection_sort

import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SelectionSortTest {

    @Test
    fun test1() {
        assertArrayEquals(
            arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9),
            selectionSort(arrayOf(8, 4, 3, 2, 9, 0, 1, 5, 7, 6))
        )
    }

    @Test
    fun test2() {
        assertArrayEquals(
            arrayOf(-66, -4, -1, 2, 3, 5, 7, 9, 100, 10000),
            selectionSort(arrayOf(100, -1, 2, 3, -4, 5, -66, 7, 10000, 9))
        )
    }
}