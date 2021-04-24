package leetcoding.algorithms.problem0377

class Solution1 : Solution {

    override fun combinationSum4(nums: IntArray, target: Int): Int = combinationSum4WihDp(nums, target, mutableMapOf())

    private fun combinationSum4WihDp(nums: IntArray, target: Int, dp: MutableMap<Int, Int>): Int {
        if (dp.containsKey(target)) return dp[target]!!
        var sum = 0
        for (num in nums) if (num == target) sum++ else if (num < target) sum += combinationSum4WihDp(nums, target - num, dp)
        dp[target] = sum
        return dp[target]!!
    }
}
