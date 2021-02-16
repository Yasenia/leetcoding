package leetcoding.algorithms.problem0006

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<String, Int>, String>() {

    override val solutions: List<ISolution<Pair<String, Int>, String>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<String, Int>, String>> = listOf(
        Pair("PAYPALISHIRING", 3) to "PAHNAPLSIIGYIR",
        Pair("PAYPALISHIRING", 4) to "PINALSIGYAHRPI",
        Pair("A", 1) to "A",
    )
}
