package leetcoding.algorithms.problem0174

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, Int>() {

    override val solutions: List<ISolution<Array<IntArray>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Array<IntArray>, Int>> = listOf(
        arrayOf(
            intArrayOf(-2, -3, 3),
            intArrayOf(-5, -10, 1),
            intArrayOf(10, 30, -5),
        ) to 7,
    )
}
