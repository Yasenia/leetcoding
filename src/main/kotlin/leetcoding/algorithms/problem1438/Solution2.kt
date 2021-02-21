package leetcoding.algorithms.problem1438

class Solution2 : Solution {

    override fun longestSubarray(nums: IntArray, limit: Int): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        var longest = 0
        var left = 0
        for (right in nums.indices) {
            val rv = nums[right]
            max = max.coerceAtLeast(rv)
            min = min.coerceAtMost(rv)
            if (max - min <= limit) longest = longest.coerceAtLeast(right + 1 - left)
            else {
                left = right
                max = rv
                min = rv
                while (left >= 0) {
                    val lv = nums[left]
                    val nMax = max.coerceAtLeast(lv)
                    val nMin = min.coerceAtMost(lv)
                    if (nMax - nMin > limit) break
                    max = nMax
                    min = nMin
                    left--
                }
                left++
            }
        }
        return longest
    }
}
