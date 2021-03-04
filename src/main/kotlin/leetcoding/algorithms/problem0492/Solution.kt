package leetcoding.algorithms.problem0492

import leetcoding.core.ISolution

/**
 * [Problem 492](https://leetcode.com/problems/construct-the-rectangle/)
 * */
interface Solution : ISolution<Int, IntArray> {

    override fun solve(input: Int): IntArray = constructRectangle(input)

    fun constructRectangle(area: Int): IntArray
}
