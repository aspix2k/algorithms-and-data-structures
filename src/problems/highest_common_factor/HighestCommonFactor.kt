package problems.highest_common_factor

/*
 * Description:
 *
 *
 * Complexity: O() // TODO()
*/

fun findHighestCommonFactor(a: Int, b: Int): Int = when {
    a == b -> a
    a > b -> findHighestCommonFactor(a - b, b)
    else -> findHighestCommonFactor(a, b - a)
}