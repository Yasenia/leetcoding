package leetcoding.algorithms.problem0055

class Solution2 : Solution {

    override fun canJump(nums: IntArray): Boolean {
        var max = 0
        for (i in nums.indices) {
            if (max in i until nums.lastIndex) max = max.coerceAtLeast(i + nums[i]) else break
        }
        return max >= nums.lastIndex
    }
}
