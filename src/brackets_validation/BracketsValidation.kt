package brackets_validation

import java.util.*

/*
 * Description:
 *
 *
 * Complexity: O(N)
*/

private const val openChars = "[({"

fun isStringValid(string: String): Boolean = with(Stack<Char>()) {
    string.forEach { currentChar ->
        if (isOpen(currentChar)) push(currentChar)
        else isNotPair(
            first = isNotEmpty().takeIf { it }?.let { pop() } ?: '#',
            second = currentChar
        ).takeIf { it }?.let { return false }
    }
    isEmpty()
}

private fun isOpen(char: Char) = openChars.any { it == char }

private fun isNotPair(first: Char, second: Char): Boolean = when {
    first == '(' && second == ')' ||
    first == '[' && second == ']' ||
    first == '{' && second == '}' -> false
    else -> true
}
