package leetcoding.algorithms.problem1047

import leetcoding.core.ISolution

/**
 * [Problem 1047](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
 * */
interface Solution : ISolution<String, String> {

    override fun solve(input: String): String = removeDuplicates(input)

    fun removeDuplicates(s: String): String
}
