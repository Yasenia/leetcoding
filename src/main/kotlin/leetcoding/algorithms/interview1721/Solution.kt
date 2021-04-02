package leetcoding.algorithms.interview1721

import leetcoding.core.ISolution

/**
 * [Interview 17.21](https://leetcode-cn.com/problems/volume-of-histogram-lcci/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = trap(input)

    fun trap(heights: IntArray): Int
}
