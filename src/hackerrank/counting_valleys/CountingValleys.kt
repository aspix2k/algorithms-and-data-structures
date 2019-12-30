package hackerrank.counting_valleys

/*
 * Link: http://bit.ly/369PMnI
 *
 * Complexity: O(N)
*/


fun countValleys(s: String): Int {
    var valleys = 0
    var currentLevel = 0
    s.forEach { currentChar ->
        if (currentChar == 'D') {
            if (currentLevel == 0) valleys++
            currentLevel--
        } else currentLevel++
    }

    return valleys
}