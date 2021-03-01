package leetcoding.algorithms.problem0393

import leetcoding.core.ISolution

/**
 * [Problem 393](https://leetcode.com/problems/utf-8-validation/)
 * */
interface Solution : ISolution<IntArray, Boolean> {

    override fun solve(input: IntArray): Boolean = validUtf8(input)

    fun validUtf8(data: IntArray): Boolean
}
