package leetcoding.algorithms.problem0054

import leetcoding.core.ISolution

/**
 * [Problem 54](https://leetcode.com/problems/spiral-matrix/)
 * */
interface Solution : ISolution<Array<IntArray>, List<Int>> {

    override fun solve(input: Array<IntArray>): List<Int> = spiralOrder(input)

    fun spiralOrder(matrix: Array<IntArray>): List<Int>
}
