package leetcoding.algorithms.problem1052

import leetcoding.core.ISolution

/**
 * [Problem 1052](https://leetcode.com/problems/grumpy-bookstore-owner/)
 * */
interface Solution : ISolution<Triple<IntArray, IntArray, Int>, Int> {

    override fun solve(input: Triple<IntArray, IntArray, Int>): Int = maxSatisfied(input.first, input.second, input.third)

    fun maxSatisfied(customers: IntArray, grumpy: IntArray, x: Int): Int
}
