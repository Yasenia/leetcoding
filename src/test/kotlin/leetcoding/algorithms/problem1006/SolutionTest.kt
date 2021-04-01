package leetcoding.algorithms.problem1006

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Int, Int>> = listOf(
        // 4 to 7,
        10 to 12,
    )
}
