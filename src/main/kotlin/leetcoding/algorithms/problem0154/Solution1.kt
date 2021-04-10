package leetcoding.algorithms.problem0154

class Solution1 : Solution {

    override fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex
        while (left < right) {
            val mid = (left + right) / 2
            when {
                nums[mid] < nums[right] -> right = mid
                nums[mid] > nums[right] -> left = mid + 1
                else -> right--
            }
        }
        return nums[left]
    }
}
