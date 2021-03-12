package leetcoding.algorithms.problem0736

import leetcoding.core.ISolution

/**
 * [Problem 736](https://leetcode.com/problems/parse-lisp-expression/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = evaluate(input)

    fun evaluate(expression: String): Int
}
