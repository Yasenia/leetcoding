package leetcoding.algorithms.problem0766

import leetcoding.core.ISolution

/**
 * [Problem 766](https://leetcode.com/problems/toeplitz-matrix/)
 * */
interface Solution : ISolution<Array<IntArray>, Boolean> {

    override fun solve(input: Array<IntArray>): Boolean = isToeplitzMatrix(input)

    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean
}
