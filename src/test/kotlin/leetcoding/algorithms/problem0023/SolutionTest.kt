package leetcoding.algorithms.problem0023

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<ListNode?>, ListNode?>() {

    private fun linkedListOf(vararg values: Int): ListNode? {
        if (values.isEmpty()) return null
        return ListNode(values.first(), linkedListOf(*values.drop(1).toIntArray()))
    }

    override val solutions: List<ISolution<Array<ListNode?>, ListNode?>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Array<ListNode?>, ListNode?>> = listOf(
        arrayOf(linkedListOf(), linkedListOf(-1, 5, 11), linkedListOf(), linkedListOf(6, 10)) to linkedListOf(-1, 5, 6, 10, 11),
        arrayOf(linkedListOf(1, 4, 5), linkedListOf(1, 3, 4), linkedListOf(2, 6)) to linkedListOf(1, 1, 2, 3, 4, 4, 5, 6),
        emptyArray<ListNode?>() to linkedListOf(),
        arrayOf(linkedListOf()) to linkedListOf(),
    )
}
