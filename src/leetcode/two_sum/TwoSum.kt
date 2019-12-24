package leetcode.two_sum

/*
 * Description:
 *
 *
 * Complexity: O(N²)
*/

fun twoSum(nums: IntArray, target: Int): IntArray = with(mutableMapOf<Int, Int>()) {
    for ((i, value) in nums.withIndex()) {
        this[value]?.let {
            return intArrayOf(it, i)
        }
        this[target - value] = i
    }
    return intArrayOf()
}