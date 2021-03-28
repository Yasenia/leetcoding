package leetcoding.algorithms.problem0583

import leetcoding.core.ISolution

/**
 * [Problem 583](https://leetcode.com/problems/delete-operation-for-two-strings/)
 * */
interface Solution : ISolution<Pair<String, String>, Int> {

    override fun solve(input: Pair<String, String>): Int = minDistance(input.first, input.second)

    fun minDistance(word1: String, word2: String): Int
}
