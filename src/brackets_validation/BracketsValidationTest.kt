package brackets_validation

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BracketsValidationTest {

    private val validator = BracketsValidation()

    @Test
    fun test0() {
        assertTrue(validator.isStringValid(""))
    }

    @Test
    fun test1() {
        assertTrue(validator.isStringValid("()"))
    }

    @Test
    fun test2() {
        assertTrue(validator.isStringValid("(())"))
    }

    @Test
    fun test3() {
        assertFalse(validator.isStringValid("())"))
    }

    @Test
    fun test4() {
        assertFalse(validator.isStringValid("(()"))
    }

    @Test
    fun test5() {
        assertFalse(validator.isStringValid(")()"))
    }

    @Test
    fun test6() {
        assertFalse(validator.isStringValid("()("))
    }

    @Test
    fun test7() {
        assertTrue(validator.isStringValid("([])"))
    }

    @Test
    fun test8() {
        assertTrue(validator.isStringValid("[][]()"))
    }

    @Test
    fun test9() {
        assertTrue(validator.isStringValid("[](){}"))
    }

    @Test
    fun test10() {
        assertFalse(validator.isStringValid("[[][]]}"))
    }

    @Test
    fun test11() {
        assertTrue(validator.isStringValid("{()}[({})]"))
    }

    @Test
    fun test12() {
        assertFalse(validator.isStringValid("{}[]({[})"))
    }

    @Test
    fun test13() {
        assertFalse(validator.isStringValid("([{}}])"))
    }

    @Test
    fun test14() {
        assertFalse(validator.isStringValid(")(){}[{()}]"))
    }

    @Test
    fun test15() {
        assertFalse(validator.isStringValid("([](){[())]})"))
    }

    @Test
    fun test16() {
        assertFalse(validator.isStringValid("[][](){}([[{})]])"))
    }

    @Test
    fun test17() {
        assertTrue(validator.isStringValid("{(((())))[{[][]()}(){}()[]]}"))
    }

    @Test
    fun test18() {
        assertFalse(validator.isStringValid("{(((())))[{[][]()}(){}{()[]]}"))
    }
}