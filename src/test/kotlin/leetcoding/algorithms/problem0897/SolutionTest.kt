package leetcoding.algorithms.problem0897

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<TreeNode?, TreeNode?>() {

    override val solutions: List<ISolution<TreeNode?, TreeNode?>> = listOf(Solution1())

    override val testCases: List<Pair<TreeNode?, TreeNode?>> = listOf(
        binaryTreeOf(5, 1, 7) to binaryTreeOf(1, null, 5, null, null, null, 7),
    )
}
