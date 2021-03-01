package leetcoding.algorithms.problem0303

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, List<Pair<Int, Int>>>, List<Int>>() {

    override val solutions: List<ISolution<Pair<IntArray, List<Pair<Int, Int>>>, List<Int>>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Pair<IntArray, List<Pair<Int, Int>>>, List<Int>>> = listOf(
        Pair(
            intArrayOf(-2, 0, 3, -5, 2, -1),
            listOf(Pair(0, 2), Pair(2, 5), Pair(0, 5))
        ) to listOf(1, -1, -3),
    )
}
