package leetcoding.algorithms.problem0002

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<ListNode?, ListNode?>, ListNode?>() {

    private fun linkedListOf(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        return ListNode(values.first(), linkedListOf(*values.drop(1).toIntArray()))
    }

    override val solutions: List<ISolution<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(Solution1())
    override val testCases: List<Pair<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(
        Pair(linkedListOf(9, 9, 9), linkedListOf(1)) to linkedListOf(0, 0, 0, 1)
    )
}
