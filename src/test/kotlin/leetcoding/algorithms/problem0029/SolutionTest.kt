package leetcoding.algorithms.problem0029

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<Int, Int>, Int>() {

    override val solutions: List<ISolution<Pair<Int, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<Int, Int>, Int>> = listOf(
        // Pair(10, 3) to 3,
        // Pair(7, -3) to -2,
        // Pair(Int.MAX_VALUE, 1) to Int.MAX_VALUE,
        // Pair(Int.MAX_VALUE, -1) to Int.MIN_VALUE + 1,
        Pair(Int.MAX_VALUE, Int.MAX_VALUE) to 1,
        Pair(Int.MIN_VALUE, Int.MIN_VALUE) to 1,
        Pair(Int.MIN_VALUE, -1) to Int.MAX_VALUE,
        Pair(Int.MIN_VALUE, 1) to Int.MIN_VALUE,
        Pair(2147483647, 3) to 715827882,
    )
}
