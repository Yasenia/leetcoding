package leetcoding.algorithms.problem0304

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.lib.Tuple4

internal class SolutionTest : ISolutionTest<Pair<Array<IntArray>, List<Tuple4<Int, Int, Int, Int>>>, List<Int>>() {

    override val solutions: List<ISolution<Pair<Array<IntArray>, List<Tuple4<Int, Int, Int, Int>>>, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Array<IntArray>, List<Tuple4<Int, Int, Int, Int>>>, List<Int>>> = listOf(
        Pair(
            arrayOf(
                intArrayOf(3, 0, 1, 4, 2),
                intArrayOf(5, 6, 3, 2, 1),
                intArrayOf(1, 2, 0, 1, 5),
                intArrayOf(4, 1, 0, 1, 7),
                intArrayOf(1, 0, 3, 0, 5),
            ),
            listOf(
                Tuple4(2, 1, 4, 3),
                Tuple4(1, 1, 2, 2),
                Tuple4(1, 2, 2, 4),
            )
        ) to listOf(8, 11, 12)
    )
}
