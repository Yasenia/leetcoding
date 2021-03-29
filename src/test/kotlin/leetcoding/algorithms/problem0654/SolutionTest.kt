package leetcoding.algorithms.problem0654

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode
import leetcoding.core.datastructure.binaryTreeOf

internal class SolutionTest : ISolutionTest<IntArray, TreeNode?>() {

    override val solutions: List<ISolution<IntArray, TreeNode?>> = listOf(Solution1())

    override val testCases: List<Pair<IntArray, TreeNode?>> = listOf(
        intArrayOf(3, 2, 1, 6, 0, 5) to binaryTreeOf(6, 3, 5, null, 2, 0, null, null, null, null, 1),
        intArrayOf(3, 2, 1) to binaryTreeOf(3, null, 2, null, null, null, 1),
    )
}
