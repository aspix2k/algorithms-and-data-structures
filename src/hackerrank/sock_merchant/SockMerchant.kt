package hackerrank.sock_merchant

import java.util.*

/*
 * Link: http://bit.ly/37meVM9
 *
 * Complexity: O(N*logN)
*/

fun findMaximumPairsOfSocks(array: Array<Int>): Int = with(Stack<Int>()) {
    var pairs = 0
    array.sort()
    array.forEach {
        if (isEmpty() || it != peek()) push(it)
        else pop().also { pairs++ }
    }
    pairs
}