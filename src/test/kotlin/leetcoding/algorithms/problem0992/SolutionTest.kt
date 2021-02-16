package leetcoding.algorithms.problem0992

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(1, 2, 1, 2, 3), 2) to 7,
        Pair(intArrayOf(1, 2, 1, 3, 4), 3) to 3,
        Pair(intArrayOf(1, 2, 3, 4, 2, 4, 1), 3) to 8,
    )
}
