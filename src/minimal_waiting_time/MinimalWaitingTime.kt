package minimal_waiting_time

/*
 * Description:
 *
 *
 * Complexity: O(N*logN)
*/

fun findMinimalWaitingTime(array: Array<Int>): Int = with(array) {
    var minTime = 0
    sort()
    for (i in 0 until array.lastIndex) {
        minTime += array[i] * (size - (i + 1))
    }

    minTime
}