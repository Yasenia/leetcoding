package leetcoding.algorithms.problem0015

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, List<List<Int>>>() {

    override val solutions: List<ISolution<IntArray, List<List<Int>>>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, List<List<Int>>>> = listOf(
        intArrayOf(-2, 0, 0, 2, 2) to listOf(listOf(-2, 0, 2)),
        intArrayOf(-1, 0, 1, 2, -1, -4) to listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)),
        intArrayOf() to listOf(),
        intArrayOf(0) to listOf(),
    )
}
