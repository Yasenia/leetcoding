package leetcoding.algorithms.problem0027

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(3, 2, 2, 3), 3) to 2,
        Pair(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2) to 5,
    )
}
