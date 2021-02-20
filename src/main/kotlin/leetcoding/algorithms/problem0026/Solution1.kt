package leetcoding.algorithms.problem0026

class Solution1 : Solution {

    override fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (j in nums.indices) if (nums[j] != nums[i]) nums[++i] = nums[j]
        return i + 1
    }
}
