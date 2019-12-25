package base.selection_sort

/*
 * Description:
 * Sort array using Selection Sort.
 *
 * Input: unsorted array
 * Output: sorted array
 *
 * Complexity: O(N²)
*/

fun selectionSort(array: Array<Int>): Array<Int> {
    for (i in 0 until array.lastIndex) {
        var min = array[i]
        var minIndex = i
        for (j in (i + 1)..array.lastIndex) {
            if (array[j] < min) {
                min = array[j]
                minIndex = j
            }
        }
        val temp = array[i]
        array[i] = array[minIndex]
        array[minIndex] = temp
    }
    return array
}