package leetcoding.algorithms.problem0083

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<ListNode?, ListNode?>() {

    override val solutions: List<ISolution<ListNode?, ListNode?>> = listOf(Solution1())

    override val testCases: List<Pair<ListNode?, ListNode?>> = listOf(
        linkedListOf(1, 1, 1) to linkedListOf(1),
        linkedListOf(1, 1, 2) to linkedListOf(1, 2),
        linkedListOf(1, 1, 2, 3, 3) to linkedListOf(1, 2, 3),
    )
}
