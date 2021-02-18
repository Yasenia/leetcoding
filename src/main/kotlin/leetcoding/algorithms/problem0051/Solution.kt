package leetcoding.algorithms.problem0051

import leetcoding.core.ISolution

/**
 * [Problem 51](https://leetcode.com/problems/n-queens/)
 * */
interface Solution : ISolution<Int, List<List<String>>> {

    override fun solve(input: Int): List<List<String>> = solveNQueens(input)

    fun solveNQueens(n: Int): List<List<String>>
}
