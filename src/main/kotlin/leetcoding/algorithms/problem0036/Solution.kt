package leetcoding.algorithms.problem0036

import leetcoding.core.ISolution

/**
 * [Problem 36](https://leetcode.com/problems/valid-sudoku/)
 * */
interface Solution : ISolution<Array<CharArray>, Boolean> {

    override fun solve(input: Array<CharArray>): Boolean = isValidSudoku(input)

    fun isValidSudoku(board: Array<CharArray>): Boolean
}
