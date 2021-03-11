package leetcoding.algorithms.problem0904

import leetcoding.core.ISolution

/**
 * [Problem 904](https://leetcode.com/problems/fruit-into-baskets/)
 * */
interface Solution : ISolution<IntArray, Int> {

    override fun solve(input: IntArray): Int = totalFruit(input)

    fun totalFruit(tree: IntArray): Int
}
