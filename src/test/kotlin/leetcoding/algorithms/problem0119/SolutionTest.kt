package leetcoding.algorithms.problem0119

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<Int, List<Int>>() {

    override val solutions: List<ISolution<Int, List<Int>>> = listOf(Solution1(), Solution2(), Solution3())

    override val testCases: List<Pair<Int, List<Int>>> = listOf(
//        0 to listOf(1),
//        1 to listOf(1, 1),
//        2 to listOf(1, 2, 1),
//        3 to listOf(1, 3, 3, 1),
//        4 to listOf(1, 4, 6, 4, 1),
//        5 to listOf(1, 5, 10, 10, 5, 1),
//        18 to listOf(1, 18, 153, 816, 3060, 8568, 18564, 31824, 43758, 48620, 43758, 31824, 18564, 8568, 3060, 816, 153, 18, 1),
        31 to listOf(
            1, 31, 465, 4495, 31465, 169911, 736281, 2629575, 7888725, 20160075, 44352165, 84672315, 141120525, 206253075, 265182525, 300540195,
            300540195, 265182525, 206253075, 141120525, 84672315, 44352165, 20160075, 7888725, 2629575, 736281, 169911, 31465, 4495, 465, 31, 1
        )
    )
}
