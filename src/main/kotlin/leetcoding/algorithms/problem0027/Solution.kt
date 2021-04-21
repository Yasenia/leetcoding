package leetcoding.algorithms.problem0027

import leetcoding.core.ISolution

/**
 * [Problem 27](https://leetcode.com/problems/remove-element/)
 * */
interface Solution : ISolution<Pair<IntArray, Int>, Int> {

    override fun solve(input: Pair<IntArray, Int>): Int = removeElement(input.first.copyOf(), input.second)

    fun removeElement(nums: IntArray, value: Int): Int
}
