package leetcoding.algorithms.problem1473

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.lib.Tuple5

internal class SolutionTest : ISolutionTest<Tuple5<IntArray, Array<IntArray>, Int, Int, Int>, Int>() {

    override val solutions: List<ISolution<Tuple5<IntArray, Array<IntArray>, Int, Int, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Tuple5<IntArray, Array<IntArray>, Int, Int, Int>, Int>> = listOf(
        Tuple5(
            intArrayOf(0, 0, 0, 0, 0),
            arrayOf(
                intArrayOf(1, 10),
                intArrayOf(10, 1),
                intArrayOf(10, 1),
                intArrayOf(1, 10),
                intArrayOf(5, 1),
            ),
            5, 2, 3
        ) to 9,
        Tuple5(
            intArrayOf(0, 2, 1, 2, 0),
            arrayOf(
                intArrayOf(1, 10),
                intArrayOf(10, 1),
                intArrayOf(10, 1),
                intArrayOf(1, 10),
                intArrayOf(5, 1),
            ),
            5, 2, 3
        ) to 11,
        Tuple5(
            intArrayOf(0, 0, 0, 0, 0),
            arrayOf(
                intArrayOf(1, 10),
                intArrayOf(10, 1),
                intArrayOf(1, 10),
                intArrayOf(10, 1),
                intArrayOf(1, 10),
            ),
            5, 2, 5
        ) to 5,
        Tuple5(
            intArrayOf(3, 1, 2, 3),
            arrayOf(
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
                intArrayOf(1, 1, 1),
            ),
            4, 3, 3
        ) to -1,
    )
}
