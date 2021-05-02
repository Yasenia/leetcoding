package leetcoding.algorithms.problem0554

import leetcoding.core.ISolution

/**
 * [Problem 554](https://leetcode.com/problems/brick-wall/)
 * */
interface Solution : ISolution<List<List<Int>>, Int> {

    override fun solve(input: List<List<Int>>): Int = leastBricks(input)

    fun leastBricks(wall: List<List<Int>>): Int
}
