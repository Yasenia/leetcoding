package leetcoding.algorithms.problem0150

import leetcoding.core.ISolution

/**
 * [Problem 150](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
 * */
interface Solution : ISolution<Array<String>, Int> {

    override fun solve(input: Array<String>): Int = evalRPN(input)

    fun evalRPN(tokens: Array<String>): Int
}
