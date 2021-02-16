package leetcoding.algorithms.problem0978

import leetcoding.core.ISolution

/**
 * [Problem 978](https://leetcode.com/problems/longest-turbulent-subarray/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = maxTurbulenceSize(input)

    fun maxTurbulenceSize(arr: IntArray): Int
}
