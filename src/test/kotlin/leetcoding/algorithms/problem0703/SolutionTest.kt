package leetcoding.algorithms.problem0703

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Pair<Int, IntArray>, List<Int>>, List<Int>>() {

    override val solutions: List<ISolution<Pair<Pair<Int, IntArray>, List<Int>>, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Pair<Int, IntArray>, List<Int>>, List<Int>>> = listOf(
        Pair(Pair(3, intArrayOf(4, 5, 8, 2)), listOf(3, 5, 10, 9, 4)) to listOf(4, 5, 5, 8, 8)
    )
}
