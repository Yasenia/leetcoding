package leetcoding.algorithms.problem0485

class Solution1 : Solution {

    override fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var consecutive = 0
        for (num in nums) {
            if (num != 1) consecutive = 0
            else if (++consecutive > max) max = consecutive
        }
        return max
    }
}
