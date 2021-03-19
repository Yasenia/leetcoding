package leetcoding.algorithms.problem0455

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, IntArray>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, IntArray>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, IntArray>, Int>> = listOf(
        Pair(intArrayOf(1, 2, 3), intArrayOf(1, 1)) to 1,
        Pair(intArrayOf(1, 2), intArrayOf(1, 2, 3)) to 2,
    )
}
