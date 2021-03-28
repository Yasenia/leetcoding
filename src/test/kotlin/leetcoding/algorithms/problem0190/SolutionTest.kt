package leetcoding.algorithms.problem0190

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Int, Int>> = listOf(
        0B00000010100101000001111010011100 to 0B00111001011110000010100101000000,
        -3 to -1073741825,
    )
}
