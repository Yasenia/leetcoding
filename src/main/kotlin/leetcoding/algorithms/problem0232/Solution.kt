package leetcoding.algorithms.problem0232

import leetcoding.core.ISolution

/**
 * [Problem 232](https://leetcode.com/problems/implement-queue-using-stacks/)
 * */
interface Solution : ISolution<List<(MyQueue) -> Any>, List<Any>> {

    override fun solve(input: List<(MyQueue) -> Any>): List<Any> {
        val myQueue = buildMyQueue()
        return input.map { it.invoke(myQueue) }
    }

    fun buildMyQueue(): MyQueue
}
