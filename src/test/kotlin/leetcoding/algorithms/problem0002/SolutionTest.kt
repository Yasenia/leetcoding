package leetcoding.algorithms.problem0002

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<Pair<ListNode?, ListNode?>, ListNode?>() {

    override val solutions: List<ISolution<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<ListNode?, ListNode?>, ListNode?>> = listOf(
        Pair(linkedListOf(9, 9, 9), linkedListOf(1)) to linkedListOf(0, 0, 0, 1)
    )
}
