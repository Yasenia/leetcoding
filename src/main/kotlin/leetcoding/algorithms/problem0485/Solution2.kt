package leetcoding.algorithms.problem0485

class Solution2 : Solution {

    override fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var left = 0
        while (left <= nums.lastIndex) {
            if (nums[left] != 0) {
                var right = left + 1
                while (right <= nums.lastIndex && nums[right] == 1) right++
                if (right - left > max) max = right - left
                left = right
            } else left++
        }
        return max
    }
}
