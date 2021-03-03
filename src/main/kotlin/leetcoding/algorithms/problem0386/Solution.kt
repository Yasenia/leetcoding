package leetcoding.algorithms.problem0386

import leetcoding.core.ISolution

/**
 * [Problem 386](https://leetcode.com/problems/lexicographical-numbers/)
 * */
interface Solution : ISolution<Int, List<Int>> {

    override fun solve(input: Int): List<Int> = lexicalOrder(input)

    fun lexicalOrder(n: Int): List<Int>
}
