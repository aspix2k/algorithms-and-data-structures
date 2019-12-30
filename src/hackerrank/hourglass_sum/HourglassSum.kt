package hackerrank.hourglass_sum

fun main() {
    findMaxHourglassSum(
        arrayOf(
            arrayOf(1, 1, 1, 0, 0, 0),
            arrayOf(0, 1, 0, 0, 0, 0),
            arrayOf(1, 1, 1, 0, 0, 0),
            arrayOf(0, 0, 2, 4, 4, 0),
            arrayOf(0, 0, 1, 2, 0, 0),
            arrayOf(0, 0, 1, 2, 4, 0)
        )
    )
}

fun findMaxHourglassSum(arr: Array<Array<Int>>): Int {
    var max = -9 // because of constraint
    for (i in 0..arr.lastIndex - 2) {
        for (j in 0..arr[i].lastIndex - 2) {
            var currentSum = 0
            for (k in i..i + 2) {
                for (l in j..j + 2) {
                    currentSum += arr[k][l]
                }
            }
            currentSum = currentSum - arr[i + 1][j] - arr[i + 1][j + 2]
            if (currentSum > max) max = currentSum
        }
    }
    return max
}