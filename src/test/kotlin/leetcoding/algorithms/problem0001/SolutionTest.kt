package leetcoding.algorithms.problem0001

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, IntArray>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, IntArray>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Pair<IntArray, Int>, IntArray>> = listOf(
        Pair(intArrayOf(2, 7, 11, 15), 9) to intArrayOf(0, 1),
        Pair(intArrayOf(3, 2, 4), 6) to intArrayOf(1, 2),
        Pair(intArrayOf(3, 3), 6) to intArrayOf(0, 1),
    )
}
