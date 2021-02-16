package leetcoding.algorithms.problem0011

import leetcoding.core.ISolution

/**
 * [Problem 11](https://leetcode.com/problems/container-with-most-water/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = maxArea(input)

    fun maxArea(height: IntArray): Int
}
