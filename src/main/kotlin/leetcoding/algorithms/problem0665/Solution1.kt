package leetcoding.algorithms.problem0665

class Solution1 : Solution {

    override fun checkPossibility(nums: IntArray): Boolean {
        var errorOccurred = false
        for (i in 0 until nums.lastIndex) {
            val a = nums[i]
            val b = nums[i + 1]
            if (a > b) {
                val lowerBound = nums.getOrNull(i - 1) ?: Int.MIN_VALUE
                val upperBound = nums.getOrNull(i + 2) ?: Int.MAX_VALUE
                if (errorOccurred || (a >= upperBound && b < lowerBound)) return false
                errorOccurred = true
            }
        }
        return true
    }
}
