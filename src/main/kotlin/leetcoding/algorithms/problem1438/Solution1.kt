package leetcoding.algorithms.problem1438

class Solution1 : Solution {

    override fun longestSubarray(nums: IntArray, limit: Int): Int {
        val ranges = Array(nums.size) { i -> Array(nums.size) { j -> if (i == j) Pair(nums[i], nums[j]) else null } }
        var longest = 0
        for (i in nums.indices) {
            for (j in i..nums.lastIndex) {
                val (min, max) = calcRange(nums, i, j, ranges)
                if (max - min <= limit) longest = longest.coerceAtLeast(j + 1 - i)
            }
        }
        return longest
    }

    private fun calcRange(nums: IntArray, i: Int, j: Int, ranges: Array<Array<Pair<Int, Int>?>>): Pair<Int, Int> {
        if (i > j) throw AssertionError()
        if (ranges[i][j] == null) {
            val (minWithoutJ, maxWithoutJ) = calcRange(nums, i, j - 1, ranges)
            ranges[i][j] = Pair(minOf(nums[j], minWithoutJ), maxOf(nums[j], maxWithoutJ))
        }
        return ranges[i][j]!!
    }
}
