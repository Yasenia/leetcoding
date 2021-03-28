package leetcoding.algorithms.problem0341

import leetcoding.core.ISolution
import leetcoding.core.datastructure.NestedInteger

/**
 * [Problem 341](https://leetcode.com/problems/flatten-nested-list-iterator/)
 * */
interface Solution : ISolution<List<NestedInteger>, List<Int>> {

    override fun solve(input: List<NestedInteger>): List<Int> {
        val nestedIterator = buildNestedIterator(input)
        return generateSequence { if (nestedIterator.hasNext()) nestedIterator.next() else null }.toList()
    }

    fun buildNestedIterator(nestedList: List<NestedInteger>): NestedIterator
}
