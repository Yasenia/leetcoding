package leetcoding.algorithms.problem0363

import leetcoding.core.ISolution

/**
 * [Problem 363](https://leetcode.com/problems/max-sum-of-rectangle-no-larger-than-k/)
 * */
interface Solution : ISolution<Pair<Array<IntArray>, Int>, Int> {

    override fun solve(input: Pair<Array<IntArray>, Int>): Int = maxSumSubmatrix(input.first, input.second)

    fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int
}
