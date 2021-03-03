package leetcoding.algorithms.problem0030

import leetcoding.core.ISolution

/**
 * [Problem 30](https://leetcode.com/problems/substring-with-concatenation-of-all-words/)
 * */
interface Solution : ISolution<Pair<String, Array<String>>, List<Int>> {

    override fun solve(input: Pair<String, Array<String>>): List<Int> = findSubstring(input.first, input.second)

    fun findSubstring(s: String, words: Array<String>): List<Int>
}
