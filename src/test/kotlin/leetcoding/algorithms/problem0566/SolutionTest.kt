package leetcoding.algorithms.problem0566

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Triple<Array<IntArray>, Int, Int>, Array<IntArray>>() {

    override val solutions: List<ISolution<Triple<Array<IntArray>, Int, Int>, Array<IntArray>>> = listOf(Solution1())

    override val testCases: List<Pair<Triple<Array<IntArray>, Int, Int>, Array<IntArray>>> = listOf(
        Triple(
            arrayOf(intArrayOf(1, 2, 3, 4)),
            2, 2
        ) to
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)),
        Triple(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)),
            1, 4
        ) to
            arrayOf(intArrayOf(1, 2, 3, 4)),
        Triple(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)),
            2, 4
        ) to
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)),
        Triple(
            arrayOf(intArrayOf(1, 2), intArrayOf(3, 4)),
            4, 1
        ) to
            arrayOf(intArrayOf(1), intArrayOf(2), intArrayOf(3), intArrayOf(4)),
    )
}
