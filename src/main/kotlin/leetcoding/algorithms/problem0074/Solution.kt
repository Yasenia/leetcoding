package leetcoding.algorithms.problem0074

import leetcoding.core.ISolution

/**
 * [Problem 74](https://leetcode.com/problems/search-a-2d-matrix/)
 * */
interface Solution : ISolution<Pair<Array<IntArray>, Int>, Boolean> {

    override fun solve(input: Pair<Array<IntArray>, Int>): Boolean = searchMatrix(input.first, input.second)

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean
}
