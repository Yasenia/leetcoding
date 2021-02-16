package leetcoding.algorithms.problem0008

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1())

    override val testCases: List<Pair<String, Int>> = listOf(
        "42" to 42,
        "-42" to -42,
        Int.MAX_VALUE.toString() to Int.MAX_VALUE,
        Int.MIN_VALUE.toString() to Int.MIN_VALUE,
        "123232131233431431251" to Int.MAX_VALUE,
        "-123232131233431431251" to Int.MIN_VALUE,
        "-1232321opfea31233431431251" to -1232321,
        "-91283472332" to Int.MIN_VALUE,
        "  0000000000012345678" to 12345678,
    )
}
