package leetcoding.algorithms.problem0061

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<Pair<ListNode?, Int>, ListNode?>() {

    override val solutions: List<ISolution<Pair<ListNode?, Int>, ListNode?>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<ListNode?, Int>, ListNode?>> = listOf(
        Pair(linkedListOf(1, 2, 3, 4, 5), 2) to linkedListOf(4, 5, 1, 2, 3),
        Pair(linkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 23) to linkedListOf(5, 6, 7, 8, 9, 1, 2, 3, 4),
        Pair(linkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 9) to linkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9),
        Pair(linkedListOf(0, 1, 2), 4) to linkedListOf(2, 0, 1),
    )
}
