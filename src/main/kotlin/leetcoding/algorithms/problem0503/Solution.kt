package leetcoding.algorithms.problem0503

import leetcoding.core.ISolution

/**
 * [Problem 503](https://leetcode.com/problems/next-greater-element-ii/)
 * */
interface Solution : ISolution<IntArray, IntArray> {

    override fun solve(input: IntArray): IntArray = nextGreaterElements(input)

    fun nextGreaterElements(nums: IntArray): IntArray
}
