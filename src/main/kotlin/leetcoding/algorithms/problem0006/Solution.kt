package leetcoding.algorithms.problem0006

import leetcoding.core.ISolution

/**
 * [Problem 6](https://leetcode.com/problems/zigzag-conversion/)
 */
interface Solution : ISolution<Pair<String, Int>, String> {

    override fun solve(input: Pair<String, Int>): String = convert(input.first, input.second)

    fun convert(s: String, numRows: Int): String
}
