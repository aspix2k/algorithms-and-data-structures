package bubble_sort

fun sort(array: Array<Int>): Array<Int> {
    for (i in array.lastIndex - 1 downTo 0) {
        var hasSwaps = false
        for (j in 0..i) {
            if (array[j] >= array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
                hasSwaps = true
            }
        }
        if (!hasSwaps) break
    }
    return array
}