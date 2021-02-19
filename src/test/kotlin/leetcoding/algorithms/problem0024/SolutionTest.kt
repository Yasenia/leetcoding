package leetcoding.algorithms.problem0024

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<ListNode?, ListNode?>() {

    override val solutions: List<ISolution<ListNode?, ListNode?>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<ListNode?, ListNode?>> = listOf(
        linkedListOf(1, 2) to linkedListOf(2, 1),
        linkedListOf(1, 2, 3, 4) to linkedListOf(2, 1, 4, 3),
        linkedListOf() to linkedListOf(),
        linkedListOf(1) to linkedListOf(1),
    )
}
