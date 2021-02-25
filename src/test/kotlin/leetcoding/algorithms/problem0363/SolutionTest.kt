package leetcoding.algorithms.problem0363

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Array<IntArray>, Int>, Int>() {

    override val solutions: List<ISolution<Pair<Array<IntArray>, Int>, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<Array<IntArray>, Int>, Int>> = listOf(
        Pair(
            arrayOf(
                intArrayOf(1, 0, 1),
                intArrayOf(0, -2, 3)
            ),
            2
        ) to 2,
        Pair(
            arrayOf(
                intArrayOf(2, 2, -1),
            ),
            0
        ) to -1,
    )
}
