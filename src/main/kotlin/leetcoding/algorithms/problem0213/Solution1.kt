package leetcoding.algorithms.problem0213

class Solution1 : Solution {

    override fun rob(nums: IntArray): Int {
        if (nums.size <= 1) return nums.firstOrNull() ?: 0
        val dpIncludeFirst = IntArray(nums.size)
        val dpExcludeFirst = IntArray(nums.size)
        dpIncludeFirst[0] = nums[0]
        dpIncludeFirst[1] = maxOf(nums[0], nums[1])
        dpExcludeFirst[1] = nums[1]
        for (i in 2..nums.lastIndex) {
            dpIncludeFirst[i] = maxOf(dpIncludeFirst[i - 1], dpIncludeFirst[i - 2] + nums[i])
            dpExcludeFirst[i] = maxOf(dpExcludeFirst[i - 1], dpExcludeFirst[i - 2] + nums[i])
        }
        return maxOf(dpIncludeFirst[nums.lastIndex - 1], dpExcludeFirst.last())
    }
}
