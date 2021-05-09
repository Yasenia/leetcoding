package leetcoding.algorithms.problem1723

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Pair<IntArray, Int>, Int>() {

    override val solutions: List<ISolution<Pair<IntArray, Int>, Int>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<IntArray, Int>, Int>> = listOf(
        Pair(intArrayOf(3, 2, 3), 3) to 3,
        Pair(intArrayOf(1, 2, 4, 7, 8), 2) to 11,
        Pair(intArrayOf(5129437, 1842905, 2200851, 597069, 8618690, 5823974, 3199380, 2416829, 7138804, 2445093, 7207875, 7133141), 3) to 17952682,
    )
}
