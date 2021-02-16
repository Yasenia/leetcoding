package leetcoding.algorithms.problem0004

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, IntArray>, Double>() {

    override val solutions: List<ISolution<Pair<IntArray, IntArray>, Double>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, IntArray>, Double>> = listOf(
        Pair(intArrayOf(1, 3), intArrayOf(2)) to 2.0,
        Pair(intArrayOf(1, 3), intArrayOf(2)) to 2.0,
        Pair(intArrayOf(1, 3), intArrayOf(2)) to 2.0,
        Pair(intArrayOf(1, 2), intArrayOf(3, 4)) to 2.5,
        Pair(intArrayOf(1, 2, 3, 5), intArrayOf(0, 4, 8)) to 3.0,
        Pair(intArrayOf(0, 0, 0, 0, 0), intArrayOf(-1, 0, 0, 0, 0, 0, 1)) to 0.0,
        Pair(intArrayOf(1, 2, 3, 4), intArrayOf(1, 2, 3, 4)) to 2.5,
        Pair(intArrayOf(1, 3), intArrayOf(2, 7)) to 2.5
    )
}
