package leetcoding.algorithms.problem0088

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.lib.Tuple4

internal class SolutionTest : ISolutionTest<Tuple4<IntArray, Int, IntArray, Int>, IntArray>() {

    override val solutions: List<ISolution<Tuple4<IntArray, Int, IntArray, Int>, IntArray>> = listOf(Solution1())

    override val testCases: List<Pair<Tuple4<IntArray, Int, IntArray, Int>, IntArray>> = listOf(
        Tuple4(
            intArrayOf(1, 2, 3, 0, 0, 0), 3,
            intArrayOf(2, 5, 6), 3
        ) to intArrayOf(1, 2, 2, 3, 5, 6),
        Tuple4(
            intArrayOf(1), 1,
            intArrayOf(), 0
        ) to intArrayOf(1),
        Tuple4(
            intArrayOf(0), 0,
            intArrayOf(1), 1
        ) to intArrayOf(1),
    )
}
