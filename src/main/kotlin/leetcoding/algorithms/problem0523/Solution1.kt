package leetcoding.algorithms.problem0523

class Solution1 : Solution {

    override fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val prefixSums = IntArray(nums.size + 1)
        for (i in nums.indices) {
            prefixSums[i + 1] = prefixSums[i] + nums[i]
            for (j in 0 until i) {
                val subSum = prefixSums[i + 1] - prefixSums[j]
                if (subSum == 0 || (k != 0 && subSum % k == 0)) return true
            }
        }
        return false
    }
}
