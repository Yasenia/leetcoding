package leetcoding.algorithms.problem0092

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.ListNode
import leetcoding.core.datastructure.linkedListOf

internal class SolutionTest : ISolutionTest<Triple<ListNode?, Int, Int>, ListNode?>() {

    override val solutions: List<ISolution<Triple<ListNode?, Int, Int>, ListNode?>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<ListNode?, Int, Int>, ListNode?>> = listOf(
        Triple(linkedListOf(1, 2, 3, 4, 5), 2, 4) to linkedListOf(1, 4, 3, 2, 5),
        Triple(linkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 1, 9) to linkedListOf(9, 8, 7, 6, 5, 4, 3, 2, 1),
        Triple(linkedListOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 2, 9) to linkedListOf(1, 9, 8, 7, 6, 5, 4, 3, 2),
    )
}
