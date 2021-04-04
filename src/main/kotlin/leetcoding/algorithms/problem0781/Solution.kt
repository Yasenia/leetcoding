package leetcoding.algorithms.problem0781

import leetcoding.core.ISolution

/**
 * [Problem 781](https://leetcode.com/problems/rabbits-in-forest/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = numRabbits(input)

    fun numRabbits(answers: IntArray): Int
}
