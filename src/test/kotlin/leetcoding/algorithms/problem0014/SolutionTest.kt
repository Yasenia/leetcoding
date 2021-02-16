package leetcoding.algorithms.problem0014

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Array<String>, String>() {

    override val solutions: List<ISolution<Array<String>, String>> = listOf(Solution1(), Solution2())

    override val testCases: List<Pair<Array<String>, String>> = listOf(
        arrayOf("flower", "flow", "flight") to "fl",
        arrayOf("dog", "racecar", "car") to "",
    )
}
