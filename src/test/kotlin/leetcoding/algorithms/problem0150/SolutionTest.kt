package leetcoding.algorithms.problem0150

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<String>, Int>() {

    override val solutions: List<ISolution<Array<String>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Array<String>, Int>> = listOf(
        arrayOf("2", "1", "+", "3", "*") to 9,
        arrayOf("4", "13", "5", "/", "+") to 6,
        arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+") to 22,
    )
}
