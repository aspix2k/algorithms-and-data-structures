package common_point

import org.junit.Test
import kotlin.random.Random
import kotlin.test.assertSame

class CommonPointTest {

    @Test
    fun test0() {
        assertSame(
            3,
            findIntervalsWithCommonPoints1(
                arrayOf(
                    arrayOf(0, 10),
                    arrayOf(1, 6),
                    arrayOf(2, 3)
                )
            )
        )
    }

    @Test
    fun test1() {
        assertSame(
            3,
            findIntervalsWithCommonPoints1(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(0, 2),
                    arrayOf(1, 2)
                )
            )
        )
    }

    @Test
    fun test2() {
        assertSame(
            1,
            findIntervalsWithCommonPoints1(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(2, 3),
                    arrayOf(4, 5)
                )
            )
        )
    }

    @Test
    fun test3() {
        assertSame(
            2,
            findIntervalsWithCommonPoints1(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(1, 3),
                    arrayOf(-100, -99)
                )
            )
        )
    }

    @Test
    fun test4() {
        assertSame(
            1,
            findIntervalsWithCommonPoints1(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(2, 3),
                    arrayOf(-100, -99)
                )
            )
        )
    }

    @Test
    fun test5() {
        assertSame(
            3,
            findIntervalsWithCommonPoints2(
                arrayOf(
                    arrayOf(0, 10),
                    arrayOf(1, 6),
                    arrayOf(2, 3)
                )
            )
        )
    }

    @Test
    fun test6() {
        assertSame(
            3,
            findIntervalsWithCommonPoints2(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(0, 2),
                    arrayOf(1, 2)
                )
            )
        )
    }

    @Test
    fun test7() {
        assertSame(
            1,
            findIntervalsWithCommonPoints2(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(2, 3),
                    arrayOf(4, 5)
                )
            )
        )
    }

    @Test
    fun test8() {
        assertSame(
            2,
            findIntervalsWithCommonPoints2(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(1, 3),
                    arrayOf(-100, -99)
                )
            )
        )
    }

    @Test
    fun test9() {
        assertSame(
            1,
            findIntervalsWithCommonPoints2(
                arrayOf(
                    arrayOf(0, 1),
                    arrayOf(2, 3),
                    arrayOf(-100, -99)
                )
            )
        )
    }

    @Test
    fun test100() {
        val random = Random(1)
        val array = Array<Array<Int>>(100000) {
            arrayOf(random.nextInt(-100, 100), random.nextInt(-100, 100))
        }
        findIntervalsWithCommonPoints1(array)
    }

    @Test
    fun test101() {
        val random = Random(1)
        val array = Array<Array<Int>>(100000) {
            arrayOf(random.nextInt(-100, 100), random.nextInt(-100, 100))
        }
        findIntervalsWithCommonPoints2(array)
    }
}