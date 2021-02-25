package leetcoding.algorithms.problem0867

import leetcoding.core.ISolution

/**
 * [Problem 867](https://leetcode.com/problems/transpose-matrix/)
 * */
interface Solution : ISolution<Array<IntArray>, Array<IntArray>> {

    override fun solve(input: Array<IntArray>): Array<IntArray> = transpose(input)

    fun transpose(matrix: Array<IntArray>): Array<IntArray>
}
