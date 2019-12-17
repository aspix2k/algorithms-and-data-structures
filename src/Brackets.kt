import org.junit.Test
import java.util.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Brackets {

    // определяем список закрывающих элементов
    // эта переменная типа String, но далее с ней работа ведется как с массивом Char
    private val closingChars = "])}"

    // функция валидации строки. на входе сама строка, на выходе - результат валидации
    private fun isStringValid(string: String): Boolean {
        // создаем переменную стека
        val stack = Stack<Char>()

        // начинаем ходить по всем символам входной строки. обозначаем текущий элемент как currentChar
        string.forEach { currentChar ->
            if (stack.empty()) { // если стек пустой
                // если текущий символ - закрывающий, то строка невалидная - возвращаем false
                if (isClosing(currentChar)) return false
                stack.push(currentChar) //  кладем элемент в стек
            } else { // иначе (стек не пустой)
                when {
                    // если верхний элемент стека и текущий - парные, то убираем верхний элемент стека
                    isPair(stack.peek(), currentChar) -> stack.pop()
                    // если текущий элемент - закрывающий, то строка невалидна
                    isClosing(currentChar) -> return false
                    // иначе - добаляем элемент в стек
                    else -> stack.push(currentChar)
                }
            }
        }

        return stack.empty() // если стек пустой -> строка валидна
    }

    // функция для определения, является ли текущий элемент закрывающим
    private fun isClosing(char: Char) = closingChars.any { it == char }

    // функция для определения, являются ли два элемента парными
    private fun isPair(first: Char, second: Char): Boolean = when {
        first == '(' && second == ')' -> true
        first == '[' && second == ']' -> true
        first == '{' && second == '}' -> true
        else -> false
    }

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