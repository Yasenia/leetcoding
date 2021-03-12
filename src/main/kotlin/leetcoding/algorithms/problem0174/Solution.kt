package leetcoding.algorithms.problem0174

import leetcoding.core.ISolution

/**
 * [Problem 174](https://leetcode.com/problems/dungeon-game/)
 * */
interface Solution : ISolution<Array<IntArray>, Int> {

    override fun solve(input: Array<IntArray>): Int = calculateMinimumHP(input)

    fun calculateMinimumHP(dungeon: Array<IntArray>): Int
}
