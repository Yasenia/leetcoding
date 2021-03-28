package leetcoding.algorithms.problem0173

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<TreeNode?, List<Int>>() {

    override val solutions: List<ISolution<TreeNode?, List<Int>>> = listOf(Solution1())

    override val testCases: List<Pair<TreeNode?, List<Int>>> = listOf(
        binaryTreeOf(7, 3, 15, null, null, 9, 20) to listOf(3, 7, 9, 15, 20),
    )
}
