package leetcoding.algorithms.problem1486

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Int>, Int>() {

    override val solutions: List<ISolution<Pair<Int, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Int, Int>, Int>> = listOf(
        Pair(5, 0) to 8,
        Pair(4, 3) to 8,
        Pair(1, 7) to 7,
        Pair(10, 5) to 2,
    )
}
