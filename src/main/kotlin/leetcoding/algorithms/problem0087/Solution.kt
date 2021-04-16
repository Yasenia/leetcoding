package leetcoding.algorithms.problem0087

import leetcoding.core.ISolution

/**
 * [Problem 87](https://leetcode.com/problems/scramble-string/)
 * */
interface Solution : ISolution<Pair<String, String>, Boolean> {

    override fun solve(input: Pair<String, String>): Boolean = isScramble(input.first, input.second)

    fun isScramble(s1: String, s2: String): Boolean
}
