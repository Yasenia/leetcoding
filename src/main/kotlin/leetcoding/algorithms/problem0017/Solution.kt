package leetcoding.algorithms.problem0017

import leetcoding.core.ISolution

/**
 * [Problem 17](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
 * */
interface Solution : ISolution<String, List<String>> {

    override fun solve(input: String): List<String> = letterCombinations(input)

    fun letterCombinations(digits: String): List<String>
}
