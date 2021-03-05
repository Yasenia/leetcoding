package leetcoding.algorithms.problem1017

import leetcoding.core.ISolution

/**
 * [Problem 1017](https://leetcode.com/problems/convert-to-base-2/)
 * */
interface Solution : ISolution<Int, String> {

    override fun solve(input: Int): String = baseNeg2(input)

    fun baseNeg2(n: Int): String
}
