package brackets_validation

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BracketsValidationTest {

    @Test
    fun test0() {
        assertTrue(isStringValid(""))
    }

    @Test
    fun test1() {
        assertTrue(isStringValid("()"))
    }

    @Test
    fun test2() {
        assertTrue(isStringValid("(())"))
    }

    @Test
    fun test3() {
        assertFalse(isStringValid("())"))
    }

    @Test
    fun test4() {
        assertFalse(isStringValid("(()"))
    }

    @Test
    fun test5() {
        assertFalse(isStringValid(")()"))
    }

    @Test
    fun test6() {
        assertFalse(isStringValid("()("))
    }

    @Test
    fun test7() {
        assertTrue(isStringValid("([])"))
    }

    @Test
    fun test8() {
        assertTrue(isStringValid("[][]()"))
    }

    @Test
    fun test9() {
        assertTrue(isStringValid("[](){}"))
    }

    @Test
    fun test10() {
        assertFalse(isStringValid("[[][]]}"))
    }

    @Test
    fun test11() {
        assertTrue(isStringValid("{()}[({})]"))
    }

    @Test
    fun test12() {
        assertFalse(isStringValid("{}[]({[})"))
    }

    @Test
    fun test13() {
        assertFalse(isStringValid("([{}}])"))
    }

    @Test
    fun test14() {
        assertFalse(isStringValid(")(){}[{()}]"))
    }

    @Test
    fun test15() {
        assertFalse(isStringValid("([](){[())]})"))
    }

    @Test
    fun test16() {
        assertFalse(isStringValid("[][](){}([[{})]])"))
    }

    @Test
    fun test17() {
        assertTrue(isStringValid("{(((())))[{[][]()}(){}()[]]}"))
    }

    @Test
    fun test18() {
        assertFalse(isStringValid("{(((())))[{[][]()}(){}{()[]]}"))
    }
}