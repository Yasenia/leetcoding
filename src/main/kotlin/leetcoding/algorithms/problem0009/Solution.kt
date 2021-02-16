package leetcoding.algorithms.problem0009

import leetcoding.core.ISolution

/**
 * [Problem 9](https://leetcode.com/problems/palindrome-number/)
 * */
interface Solution : ISolution<Int, Boolean> {

    override fun solve(input: Int): Boolean = isPalindrome(input)

    fun isPalindrome(x: Int): Boolean
}
