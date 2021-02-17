package leetcoding.algorithms.problem0037

import leetcoding.core.ISolution

/**
 * [Problem 37](https://leetcode.com/problems/sudoku-solver/)
 * */
interface Solution : ISolution<Array<CharArray>, Array<CharArray>> {

    override fun solve(input: Array<CharArray>): Array<CharArray> {
        solveSudoku(input)
        return input
    }

    fun solveSudoku(board: Array<CharArray>)
}
