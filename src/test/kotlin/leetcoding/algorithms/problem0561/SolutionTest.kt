package leetcoding.algorithms.problem0561

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest as ISolutionTest1

internal class SolutionTest : ISolutionTest1<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(1, 4, 3, 2) to 4,
        intArrayOf(6, 2, 6, 5, 1, 2) to 9,
    )
}
