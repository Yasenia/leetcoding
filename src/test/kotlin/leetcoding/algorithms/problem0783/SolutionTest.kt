package leetcoding.algorithms.problem0783

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<TreeNode?, Int>() {

    override val solutions: List<ISolution<TreeNode?, Int>> = listOf(Solution1())

    override val testCases: List<Pair<TreeNode?, Int>> = listOf(
        binaryTreeOf(4, 2, 6, 1, 3) to 1,
        binaryTreeOf(1, 0, 48, null, null, 12, 49) to 1,
    )
}
