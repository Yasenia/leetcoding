package leetcoding.algorithms.problem0318

import leetcoding.core.ISolution

/**
 * [Problem 318](https://leetcode.com/problems/maximum-product-of-word-lengths/)
 * */
interface Solution : ISolution<Array<String>, Int> {

    override fun solve(input: Array<String>): Int = maxProduct(input)

    fun maxProduct(words: Array<String>): Int
}
