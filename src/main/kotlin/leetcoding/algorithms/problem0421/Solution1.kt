package leetcoding.algorithms.problem0421

class Solution1 : Solution {

    override fun findMaximumXOR(nums: IntArray): Int {
        var max = 0
        for (i in nums.indices) for (j in i + 1..nums.lastIndex) max = max.coerceAtLeast(nums[i] xor nums[j])
        return max
    }
}
