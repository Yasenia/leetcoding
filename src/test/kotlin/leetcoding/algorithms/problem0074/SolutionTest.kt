package leetcoding.algorithms.problem0074

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Array<IntArray>, Int>, Boolean>() {

    override val solutions: List<ISolution<Pair<Array<IntArray>, Int>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Array<IntArray>, Int>, Boolean>> = listOf(
        Pair(
            arrayOf(
                intArrayOf(1, 3, 5, 7),
                intArrayOf(10, 11, 16, 20),
                intArrayOf(23, 30, 34, 60),
            ),
            3
        ) to true,
        Pair(
            arrayOf(
                intArrayOf(1, 3, 5, 7),
                intArrayOf(10, 11, 16, 20),
                intArrayOf(23, 30, 34, 60),
            ),
            13
        ) to false,
    )
}
