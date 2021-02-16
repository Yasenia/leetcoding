package leetcoding.algorithms.problem0001

import leetcoding.core.annotation.Complexity
import leetcoding.core.annotation.SpaceComplexity
import leetcoding.core.annotation.TimeComplexity

@TimeComplexity(Complexity.O_N)
@SpaceComplexity(Complexity.O_N)
class Solution3 : Solution {

    override fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            hash[target - nums[i]]?.also { return intArrayOf(it, i) }
            hash[nums[i]] = i
        }
        throw AssertionError()
    }
}
