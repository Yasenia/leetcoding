package leetcoding.algorithms.problem0567

import leetcoding.core.ISolution

/**
 * [Problem 567](https://leetcode.com/problems/permutation-in-string/)
 * */
interface Solution : ISolution<Pair<String, String>, Boolean> {

    override fun solve(input: Pair<String, String>): Boolean = checkInclusion(input.first, input.second)

    fun checkInclusion(s1: String, s2: String): Boolean
}
