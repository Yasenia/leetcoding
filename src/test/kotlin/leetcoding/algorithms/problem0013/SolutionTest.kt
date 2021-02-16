package leetcoding.algorithms.problem0013

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<String, Int>> = listOf(
        "I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000,
        "III" to 3, "IV" to 4, "IX" to 9, "LVIII" to 58, "MCMXCIV" to 1994
    )
}
