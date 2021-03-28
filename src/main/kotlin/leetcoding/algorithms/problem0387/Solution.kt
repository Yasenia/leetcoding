package leetcoding.algorithms.problem0387

import leetcoding.core.ISolution

/**
 * [Problem 387](https://leetcode.com/problems/first-unique-character-in-a-string/)
 * */
interface Solution : ISolution<String, Int> {

    override fun solve(input: String): Int = firstUniqChar(input)

    fun firstUniqChar(s: String): Int
}
