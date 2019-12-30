package hackerrank.repeated_string

/*
 * Link: http://bit.ly/39pR8wv
 *
 * Complexity: O(1)
*/

fun repeatedString(s: String, n: Long): Long =
    findAmount(s) * (n / s.length) + findAmount(s.substring(0, (n % s.length).toInt()))

fun findAmount(s: String): Long {
    var amount = 0L
    s.forEach { if (it == 'a') amount++ }
    return amount
}