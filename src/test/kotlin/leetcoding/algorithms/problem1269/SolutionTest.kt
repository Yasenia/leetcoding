package leetcoding.algorithms.problem1269

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Int>, Int>() {

    override val solutions: List<ISolution<Pair<Int, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Int, Int>, Int>> = listOf(
        Pair(3, 2) to 4,
        Pair(2, 4) to 2,
        Pair(4, 2) to 8,
        Pair(27, 7) to 127784505,
        Pair(430, 148488) to 525833932,
    )
}
