package leetcoding.algorithms.problem0082

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<ListNode?, ListNode?>() {

    override val solutions: List<ISolution<ListNode?, ListNode?>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<ListNode?, ListNode?>> = listOf(
        linkedListOf(1, 2, 3, 3, 4, 4, 5) to linkedListOf(1, 2, 5),
        linkedListOf(1, 1, 1, 2, 3) to linkedListOf(2, 3),
        linkedListOf(1, 2, 2) to linkedListOf(1),
    )
}
