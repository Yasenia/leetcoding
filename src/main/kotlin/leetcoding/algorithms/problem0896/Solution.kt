package leetcoding.algorithms.problem0896

import leetcoding.core.ISolution

/**
 * [Problem 896](https://leetcode.com/problems/monotonic-array/)
 * */
interface Solution : ISolution<IntArray, Boolean> {

    override fun solve(input: IntArray): Boolean = isMonotonic(input)

    fun isMonotonic(array: IntArray): Boolean
}
