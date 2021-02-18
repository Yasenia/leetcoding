package leetcoding.algorithms.problem0995

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(0, 1, 0), 1) to 2,
        Pair(intArrayOf(1, 1, 0), 2) to -1,
        Pair(intArrayOf(0, 0, 0, 1, 0, 1, 1, 0), 3) to 3,
    )
}
