package leetcoding.algorithms.problem0354

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<IntArray>, Int>() {

    override val solutions: List<ISolution<Array<IntArray>, Int>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Array<IntArray>, Int>> = listOf(
        arrayOf(
            intArrayOf(30, 50),
            intArrayOf(12, 2),
            intArrayOf(3, 4),
            intArrayOf(12, 15),
        ) to 3,
        arrayOf(
            intArrayOf(5, 4),
            intArrayOf(6, 4),
            intArrayOf(6, 7),
            intArrayOf(2, 3),
        ) to 3,
        arrayOf(
            intArrayOf(4, 5),
            intArrayOf(4, 6),
            intArrayOf(6, 7),
            intArrayOf(2, 3),
            intArrayOf(1, 1),
            intArrayOf(1, 1),
        ) to 4,
    )
}
