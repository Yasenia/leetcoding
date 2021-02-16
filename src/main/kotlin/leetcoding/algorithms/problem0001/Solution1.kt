package leetcoding.algorithms.problem0001

import leetcoding.core.annotation.Complexity
import leetcoding.core.annotation.SpaceComplexity
import leetcoding.core.annotation.TimeComplexity

@TimeComplexity(Complexity.O_N_2)
@SpaceComplexity(Complexity.O_1)
class Solution1 : Solution {

    override fun twoSum(nums: IntArray, target: Int): IntArray = twoSum(nums, target, 0, 1)

    private tailrec fun twoSum(numbers: IntArray, target: Int, first: Int, second: Int): IntArray = when {
        numbers[first] + numbers[second] == target -> intArrayOf(first, second)
        second < numbers.lastIndex -> twoSum(numbers, target, first, second + 1)
        first < numbers.lastIndex - 1 -> twoSum(numbers, target, first + 1, first + 2)
        else -> throw AssertionError()
    }
}
