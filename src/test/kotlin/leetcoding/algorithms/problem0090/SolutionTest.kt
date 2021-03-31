package leetcoding.algorithms.problem0090

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Set<Set<Int>>>() {

    override val solutions: List<ISolution<IntArray, Set<Set<Int>>>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Set<Set<Int>>>> = listOf(
        intArrayOf(1, 2, 2) to setOf(
            setOf(),
            setOf(1),
            setOf(1, 2),
            setOf(1, 2, 2),
            setOf(2),
            setOf(2, 2),
        ),
        intArrayOf(0) to setOf(
            setOf(),
            setOf(0),
        ),
    )
}
