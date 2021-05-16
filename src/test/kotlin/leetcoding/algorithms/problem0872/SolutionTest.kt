package leetcoding.algorithms.problem0872

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<Pair<TreeNode?, TreeNode?>, Boolean>() {

    override val solutions: List<ISolution<Pair<TreeNode?, TreeNode?>, Boolean>> = listOf(Solution1())

    override val testCases: List<Pair<Pair<TreeNode?, TreeNode?>, Boolean>> = listOf(
        Pair(binaryTreeOf(1, 2, 3), binaryTreeOf(8, 2, 3)) to true,
    )
}
