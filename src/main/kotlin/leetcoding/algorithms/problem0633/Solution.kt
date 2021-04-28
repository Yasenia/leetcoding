package leetcoding.algorithms.problem0633

import leetcoding.core.ISolution

/**
 * [Problem 633](https://leetcode.com/problems/sum-of-square-numbers)
 * */
interface Solution : ISolution<Int, Boolean> {

    override fun solve(input: Int): Boolean = judgeSquareSum(input)

    fun judgeSquareSum(c: Int): Boolean
}
