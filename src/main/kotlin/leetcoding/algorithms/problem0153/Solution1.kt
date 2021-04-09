package leetcoding.algorithms.problem0153

class Solution1 : Solution {

    override fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while (nums[left] > nums[right]) {
            if (right - left == 1) return nums[right]
            val mid = (left + right) / 2
            if (nums[mid] < nums[right]) right = mid else left = mid
        }
        return nums[left]
    }
}
