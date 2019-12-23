package binary_search

/*
 * Description:
 *
 *
 * Complexity: O(logN)
*/

fun binarySearch(array: Array<String>, item: String): Int? {
    var left = 0
    var right = array.lastIndex
    while (left <= right) {
        val middle = (left + right) / 2
        when {
            array[middle] > item -> right = middle + 1
            array[middle] < item -> left = middle - 1
            else -> return middle
        }
    }
    return null
}