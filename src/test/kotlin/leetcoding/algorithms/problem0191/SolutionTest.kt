package leetcoding.algorithms.problem0191

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, Int>() {

    override val solutions: List<ISolution<Int, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Int, Int>> = listOf(
        0B00000000000000000000000000001011 to 3,
        0B00000000000000000000000010000000 to 1,
        Int.MIN_VALUE to 1,
        Int.MAX_VALUE to 31,
        -1 to 32,
    )
}
