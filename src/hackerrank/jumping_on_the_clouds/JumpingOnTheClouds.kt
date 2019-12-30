package hackerrank.jumping_on_the_clouds

/*
 * Link: http://bit.ly/2tijuYQ
 *
 * Complexity: O(N)
*/

fun findMinJumps(c: Array<Int>): Int {
    var i = 0
    var jumps = 0
    while (i < c.lastIndex) {
        if (i + 2 <= c.lastIndex && c[i + 2] == 0) i += 2
        else i++
        jumps++
    }

    return jumps
}