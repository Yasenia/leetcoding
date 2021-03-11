package leetcoding.algorithms.problem0331

import leetcoding.core.ISolution

/**
 * [Problem 331](https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/)
 * */
interface Solution : ISolution<String, Boolean> {

    override fun solve(input: String): Boolean = isValidSerialization(input)

    fun isValidSerialization(preorder: String): Boolean
}
