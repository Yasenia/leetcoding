package leetcoding.algorithms.problem0448

import kotlin.math.abs

class Solution3 : Solution {

    override fun findDisappearedNumbers(nums: IntArray): List<Int> {
        for (num in nums) if (nums[abs(num) - 1] > 0) nums[abs(num) - 1] *= -1
        val list = mutableListOf<Int>()
        for (i in nums.indices) if (nums[i] > 0) list.add(i + 1)
        return list
    }
}
