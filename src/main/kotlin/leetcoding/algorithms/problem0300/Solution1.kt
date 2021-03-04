package leetcoding.algorithms.problem0300

class Solution1 : Solution {

    override fun lengthOfLIS(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        var max = 0
        for ((i, num) in nums.withIndex()) {
            dp[i] = ((0 until i).filter { nums[it] < num }.maxOfOrNull { dp[it] } ?: 0) + 1
            max = max.coerceAtLeast(dp[i])
        }
        return max
    }
}
