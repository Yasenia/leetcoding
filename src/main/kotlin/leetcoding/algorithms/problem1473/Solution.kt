package leetcoding.algorithms.problem1473

import leetcoding.core.ISolution
import leetcoding.core.lib.Tuple5

/**
 * [Problem 1473](https://leetcode.com/problems/paint-house-iii/)
 * */
interface Solution : ISolution<Tuple5<IntArray, Array<IntArray>, Int, Int, Int>, Int> {

    override fun solve(input: Tuple5<IntArray, Array<IntArray>, Int, Int, Int>): Int =
        minCost(input.first, input.second, input.third, input.fourth, input.fifth)

    fun minCost(houses: IntArray, cost: Array<IntArray>, m: Int, n: Int, target: Int): Int
}
