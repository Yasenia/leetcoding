package leetcoding.algorithms.problem0019

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<ListNode?, Int>, ListNode?>() {

    private fun linkedListOf(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        return ListNode(values.first(), linkedListOf(*values.drop(1).toIntArray()))
    }

    override val solutions: List<ISolution<Pair<ListNode?, Int>, ListNode?>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<ListNode?, Int>, ListNode?>> = listOf(
        Pair(linkedListOf(1, 2, 3, 4, 5), 2) to linkedListOf(1, 2, 3, 5),
        Pair(linkedListOf(1), 1) to linkedListOf(),
        Pair(linkedListOf(1, 2), 1) to linkedListOf(1),
    )
}
