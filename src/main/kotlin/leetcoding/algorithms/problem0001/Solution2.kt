package leetcoding.algorithms.problem0001

import leetcoding.core.annotation.Complexity
import leetcoding.core.annotation.SpaceComplexity
import leetcoding.core.annotation.TimeComplexity

@TimeComplexity(Complexity.O_N_2)
@SpaceComplexity(Complexity.O_1)
class Solution2 : Solution {

    override fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.lastIndex) {
            for (j in i + 1..nums.lastIndex) {
                if (nums[i] + nums[j] == target) return intArrayOf(i, j)
            }
        }
        throw AssertionError()
    }
}
