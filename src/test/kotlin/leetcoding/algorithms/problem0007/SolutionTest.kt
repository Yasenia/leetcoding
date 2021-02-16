package leetcoding.algorithms.problem0007

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Int, Int>> = listOf(
        123 to 321,
        -123 to -321,
        -120 to -21,
        1534236469 to 0,
        -2147483648 to 0,
    )
}
