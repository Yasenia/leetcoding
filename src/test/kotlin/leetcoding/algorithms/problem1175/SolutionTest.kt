package leetcoding.algorithms.problem1175

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Int, Int>> = listOf(
        1 to 1,
        5 to 12,
        100 to 682289015,
    )
}
