package leetcoding.algorithms.problem0051

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, List<List<String>>>() {

    override val solutions: List<ISolution<Int, List<List<String>>>> = listOf(Solution1())

    override val testCases: List<Pair<Int, List<List<String>>>> = listOf(
        4 to listOf(
            listOf(".Q..", "...Q", "Q...", "..Q."),
            listOf("..Q.", "Q...", "...Q", ".Q.."),
        ),
        1 to listOf(
            listOf("Q")
        )
    )
}
