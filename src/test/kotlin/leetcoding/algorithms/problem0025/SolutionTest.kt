package leetcoding.algorithms.problem0025

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<Pair<ListNode?, Int>, ListNode?>() {

    override val solutions: List<ISolution<Pair<ListNode?, Int>, ListNode?>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<ListNode?, Int>, ListNode?>> = listOf(
        Pair(linkedListOf(1, 2, 3, 4, 5), 2) to linkedListOf(2, 1, 4, 3, 5),
        Pair(linkedListOf(1, 2, 3, 4, 5), 3) to linkedListOf(3, 2, 1, 4, 5),
    )
}
