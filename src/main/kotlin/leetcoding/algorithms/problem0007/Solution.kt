package leetcoding.algorithms.problem0007

import leetcoding.core.ISolution

/**
 * [Problem 7](https://leetcode.com/problems/reverse-integer/)
 */
interface Solution : ISolution<Int, Int> {

    override fun solve(input: Int): Int = reverse(input)

    fun reverse(x: Int): Int
}
