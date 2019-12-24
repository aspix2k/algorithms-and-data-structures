package base.bubble_sort

import org.junit.Assert.*
import org.junit.Test

class BubbleSortTest {

    @Test
    fun test0() {
        assertArrayEquals(
            arrayOf(),
            bubbleSort(arrayOf())
        )
    }

    @Test
    fun test1() {
        assertArrayEquals(
            arrayOf(1),
            bubbleSort(arrayOf(1))
        )
    }

    @Test
    fun test2() {
        assertArrayEquals(
            arrayOf(1, 2),
            bubbleSort(arrayOf(2, 1))
        )
    }

    @Test
    fun test3() {
        assertArrayEquals(
            arrayOf(1, 2, 3, 4, 5),
            bubbleSort(arrayOf(5, 2, 4, 1, 3))
        )
    }

    @Test
    fun test4() {
        assertArrayEquals(
            arrayOf(1, 2, 3, 4, 5, 6, 7, 8),
            bubbleSort(arrayOf(8, 5, 7, 6, 1, 3, 4, 2))
        )
    }

    @Test
    fun test5() {
        assertArrayEquals(
            arrayOf(0, 0, 20, 777, 1000),
            bubbleSort(arrayOf(1000, 20, 0, 777, 0))
        )
    }

    @Test
    fun test6() {
        assertArrayEquals(
            arrayOf(1, 1, 2, 2, 3, 3),
            bubbleSort(arrayOf(2, 3, 3, 2, 1, 1))
        )
    }

    @Test
    fun test7() {
        assertArrayEquals(
            arrayOf(-20, -20, 0, 40, 900, 10000),
            bubbleSort(arrayOf(40, -20, 900, 10000, -20, 0))
        )
    }
}