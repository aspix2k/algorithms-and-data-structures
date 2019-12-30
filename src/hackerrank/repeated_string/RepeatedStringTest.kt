package hackerrank.repeated_string

import org.junit.Test
import kotlin.test.assertEquals

class RepeatedString {

    @Test
    fun test1() {
        assertEquals(
            7,
            repeatedString("aba", 10)
        )
    }

    @Test
    fun test2() {
        assertEquals(
            1000000000000,
            repeatedString("a", 1000000000000)
        )
    }
}