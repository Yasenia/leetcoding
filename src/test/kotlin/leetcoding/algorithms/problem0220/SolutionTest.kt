package leetcoding.algorithms.problem0220

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Triple<IntArray, Int, Int>, Boolean>() {

    override val solutions: List<ISolution<Triple<IntArray, Int, Int>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<IntArray, Int, Int>, Boolean>> = listOf(
        Triple(intArrayOf(1, 2, 3, 1), 3, 0) to true,
        Triple(intArrayOf(1, 0, 1, 1), 1, 2) to true,
        Triple(intArrayOf(1, 5, 9, 1, 5, 9), 2, 3) to false,
        Triple(intArrayOf(-3, 3, -6), 2, 3) to true,
        Triple(intArrayOf(2147483640, 2147483641), 1, 100) to true,
    )
}
