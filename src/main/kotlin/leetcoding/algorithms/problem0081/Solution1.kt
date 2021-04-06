package leetcoding.algorithms.problem0081

class Solution1 : Solution {

    override fun search(nums: IntArray, target: Int): Boolean = search(nums, target, 0, nums.lastIndex)

    private fun search(nums: IntArray, target: Int, left: Int, right: Int): Boolean {
        val mid = (left + right) / 2
        return when {
            left > right -> false
            target == nums[mid] || target == nums[left] || target == nums[right] -> true
            nums[left] >= nums[right] -> search(nums, target, left + 1, mid - 1) || search(nums, target, mid + 1, right - 1)
            target < nums[mid] && target > nums[left] -> search(nums, target, left + 1, mid - 1)
            target > nums[mid] && target < nums[right] -> search(nums, target, mid + 1, right - 1)
            else -> false
        }
    }
}
