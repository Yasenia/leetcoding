package leetcoding.algorithms.problem0021

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<Pair<ListNode?, ListNode?>, ListNode?>() {

    override val solutions: List<ISolution<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(
        Pair(linkedListOf(1, 2, 4), linkedListOf(1, 3, 4)) to linkedListOf(1, 1, 2, 3, 4, 4),
        Pair(linkedListOf(), linkedListOf()) to linkedListOf(),
        Pair(linkedListOf(), linkedListOf(0)) to linkedListOf(0),
    )
}
