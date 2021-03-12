package leetcoding.algorithms.problem0055

class Solution1 : Solution {

    override fun canJump(nums: IntArray): Boolean {
        val dp = BooleanArray(nums.size)
        for (i in nums.lastIndex downTo 0) dp[i] = nums[i] + i >= nums.lastIndex || (nums[i] downTo 1).any { dp[i + it] }
        return dp[0]
    }
}
