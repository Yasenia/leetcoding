package leetcoding.algorithms.problem0703

import leetcoding.core.ISolution

/**
 * [Problem 703](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
 * */
interface Solution : ISolution<Pair<Pair<Int, IntArray>, List<Int>>, List<Int>> {

    override fun solve(input: Pair<Pair<Int, IntArray>, List<Int>>): List<Int> {
        val kthLargest = buildKthLargest(input.first.first, input.first.second)
        return input.second.map { kthLargest.add(it) }
    }

    fun buildKthLargest(k: Int, nums: IntArray): KthLargest
}
