package leetcoding.algorithms.problem0456

class Solution1 : Solution {

    override fun find132pattern(nums: IntArray): Boolean {
        for (i in 0..nums.lastIndex) {
            val num = nums[i]
            val firstLessThan = (0 until i).firstOrNull { nums[it] < num } ?: continue
            if ((i - 1 downTo firstLessThan + 1).any { nums[it] > num }) return true
        }
        return false
    }
}
