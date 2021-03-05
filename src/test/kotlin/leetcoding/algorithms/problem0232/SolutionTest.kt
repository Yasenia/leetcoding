package leetcoding.algorithms.problem0232

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<List<(MyQueue) -> Any>, List<Any>>() {

    override val solutions: List<ISolution<List<(MyQueue) -> Any>, List<Any>>> = listOf(Solution1())

    override val testCases: List<Pair<List<(MyQueue) -> Any>, List<Any>>> = listOf(
        listOf<(MyQueue) -> Any>(
            { it.push(1) },
            { it.push(2) },
            { it.peek() },
            { it.pop() },
            { it.empty() },
        ) to listOf(Unit, Unit, 1, 1, false)
    )
}
