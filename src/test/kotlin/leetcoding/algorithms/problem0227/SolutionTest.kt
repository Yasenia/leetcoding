package leetcoding.algorithms.problem0227

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<String, Int>() {

    override val solutions: List<ISolution<String, Int>> = listOf(Solution1())

    override val testCases: List<Pair<String, Int>> = listOf(
        "3+2*2" to 7,
        " 3/2 " to 1,
        " 3+5 / 2 " to 5,
        "-2+1" to -1,
        " 2-1 + 2 " to 3,
        "0-2+1" to -1,
        "12+345-(57-32)" to 332,
        "1 + 1" to 2,
        "(1+(4+5+2)-3)+(6+8)" to 23,
        "(1+(4*5+2)-3)/(1+8)" to 2,
    )
}
