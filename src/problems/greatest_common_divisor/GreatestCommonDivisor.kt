package problems.greatest_common_divisor

/*
 * Description:
 *
 *
 * Complexity: O(N)
*/

fun findHighestCommonFactor(a: Int, b: Int): Int = when {
    a == b -> a
    a > b -> findHighestCommonFactor(a - b, b)
    else -> findHighestCommonFactor(a, b - a)
}

fun findHighestCommonFactorEuclidian(a: Int, b: Int): Int = when (b) {
    0 -> a
    else -> findHighestCommonFactorEuclidian(b, a % b)
}