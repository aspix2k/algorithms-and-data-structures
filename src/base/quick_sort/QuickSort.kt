package base.quick_sort

/*
 * Description:
 * Sort array using Quick Sort.
 *
 * Input: unsorted array
 * Output: sorted array
 *
 * Complexity: best - O(N*logN), worst - O(N²)
*/

fun quickSort(array: Array<Int>): Array<Int> =
    if (array.size < 2) {
        array
    } else {
        val pivot = array[0]
        val less = arrayOf<Int>().apply {
            for (i in 1..array.lastIndex) {
                if (array[i] <= pivot) plus(array[i])
            }
        }
        val greater = arrayOf<Int>().apply {
            for (i in 1..array.lastIndex) {
                if (array[i] > pivot) plus(array[i])
            }
        }
        quickSort(less) + arrayOf(pivot) + quickSort(greater)
    }