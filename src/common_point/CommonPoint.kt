package common_point

import java.util.*
import kotlin.Comparator

/*
 * Description:
 *
 *
 * Complexity (1): O(N²)
 * Complexity (2): O(N*logN)
*/

fun findIntervalsWithCommonPoints1(intervals: Array<Array<Int>>): Int = with(mutableListOf<Int>()) {
    intervals.flatten().forEach { current ->
        var commonPoints = 0
        intervals.forEach {
            if (it[0] <= current && current <= it[1]) commonPoints++
        }
        add(commonPoints)
    }
    max()!!
}

fun findIntervalsWithCommonPoints2(intervals: Array<Array<Int>>): Int {
    val list = mutableListOf<Pair<Int, Int>>()
    intervals.forEach {
        list.add(Pair(it[0], 0))
        list.add(Pair(it[1], 1))
    }
    list.sortWith(Comparator { left, right ->
        when {
            left.first == right.first && left.second > right.second -> 1
            left.first == right.first && left.second < right.second -> -1
            left.first > right.first -> 1
            left.first < right.first -> -1
            else -> 0
        }
    })

    var tempMax = 0
    var max = 0
    list.forEach {
        if (it.second == 0) tempMax++
        else tempMax--

        if (tempMax > max) max = tempMax
    }

    return max
}
