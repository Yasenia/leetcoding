package leetcoding.algorithms.problem0080

class Solution1 : Solution {

    override fun removeDuplicates(nums: IntArray): Int {
        var i = 0
        for (num in nums) if (i < 2 || num != nums[i - 2]) nums[i++] = num
        return i
    }
}
