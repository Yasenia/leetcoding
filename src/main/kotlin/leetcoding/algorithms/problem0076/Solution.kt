package leetcoding.algorithms.problem0076

import leetcoding.core.ISolution

/**
 * [Problem 76](https://leetcode.com/problems/minimum-window-substring/)
 * */
interface Solution : ISolution<Pair<String, String>, String> {

    override fun solve(input: Pair<String, String>): String = minWindow(input.first, input.second)

    fun minWindow(s: String, t: String): String
}
