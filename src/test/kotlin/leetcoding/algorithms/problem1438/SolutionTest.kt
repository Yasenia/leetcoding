package leetcoding.algorithms.problem1438

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(2, 5, 2), 9) to 3,
        Pair(intArrayOf(8, 2, 4, 7), 4) to 2,
        Pair(intArrayOf(10, 1, 2, 4, 7, 2), 5) to 4,
        Pair(intArrayOf(4, 2, 2, 2, 4, 4, 2, 2), 0) to 3,
    )
}
