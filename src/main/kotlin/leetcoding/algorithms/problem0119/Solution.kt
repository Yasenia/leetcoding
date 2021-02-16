package leetcoding.algorithms.problem0119

import leetcoding.core.ISolution

/**
 * [Problem 119](https://leetcode.com/problems/pascals-triangle-ii/)
 * */
interface Solution : ISolution<Int, List<Int>> {

    override fun solve(input: Int): List<Int> = getRow(input)

    fun getRow(rowIndex: Int): List<Int>
}
