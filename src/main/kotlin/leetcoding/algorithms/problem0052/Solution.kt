package leetcoding.algorithms.problem0052

import leetcoding.core.ISolution

/**
 * [Problem 52](https://leetcode.com/problems/n-queens-ii/)
 * */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = totalNQueens(input)

    fun totalNQueens(n: Int): Int
}
