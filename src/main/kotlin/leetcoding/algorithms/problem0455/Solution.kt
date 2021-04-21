package leetcoding.algorithms.problem0455

import leetcoding.core.ISolution

/**
 * [Problem 455](https://leetcode.com/problems/assign-cookies/)
 * */
interface Solution : ISolution<Pair<IntArray, IntArray>, Int> {

    override fun solve(input: Pair<IntArray, IntArray>): Int = findContentChildren(input.first.copyOf(), input.second.copyOf())

    fun findContentChildren(g: IntArray, s: IntArray): Int
}
