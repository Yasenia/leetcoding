package leetcoding.algorithms.problem0059

import leetcoding.core.ISolution

/**
 * [Problem 59](https://leetcode.com/problems/spiral-matrix-ii/)
 * */
interface Solution : ISolution<Int, Array<IntArray>> {

    override fun solve(input: Int): Array<IntArray> = generateMatrix(input)

    fun generateMatrix(n: Int): Array<IntArray>
}
