package leetcoding.algorithms.problem1155

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Triple<Int, Int, Int>, Int>() {

    override val solutions: List<ISolution<Triple<Int, Int, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<Int, Int, Int>, Int>> = listOf(
        Triple(1, 6, 3) to 1,
        Triple(2, 6, 7) to 6,
        Triple(2, 5, 10) to 1,
        Triple(1, 2, 3) to 0,
        Triple(30, 30, 500) to 222616187,
    )
}
