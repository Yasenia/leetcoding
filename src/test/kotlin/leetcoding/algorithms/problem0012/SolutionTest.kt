package leetcoding.algorithms.problem0012

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, String>() {

    override val solutions: List<ISolution<Int, String>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Int, String>> = listOf(
        1 to "I", 5 to "V", 10 to "X", 50 to "L", 100 to "C", 500 to "D", 1000 to "M",
        3 to "III", 4 to "IV", 9 to "IX", 58 to "LVIII", 1994 to "MCMXCIV"
    )
}
