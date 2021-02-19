package leetcoding.algorithms.problem0021

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<ListNode?, ListNode?>, ListNode?>() {

    private fun linkedListOf(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        return ListNode(values.first(), linkedListOf(*values.drop(1).toIntArray()))
    }

    override val solutions: List<ISolution<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(
        Pair(linkedListOf(1, 2, 4), linkedListOf(1, 3, 4)) to linkedListOf(1, 1, 2, 3, 4, 4),
        Pair(linkedListOf(), linkedListOf()) to linkedListOf(),
        Pair(linkedListOf(), linkedListOf(0)) to linkedListOf(0),
    )
}
