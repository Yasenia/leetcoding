package leetcoding.algorithms.problem1042

import leetcoding.core.ISolution

/**
 * [Problem 1042](https://leetcode.com/problems/flower-planting-with-no-adjacent/)
 * */
interface Solution : ISolution<Pair<Int, Array<IntArray>>, IntArray> {

    override fun solve(input: Pair<Int, Array<IntArray>>): IntArray = gardenNoAdj(input.first, input.second)

    fun gardenNoAdj(n: Int, paths: Array<IntArray>): IntArray
}
