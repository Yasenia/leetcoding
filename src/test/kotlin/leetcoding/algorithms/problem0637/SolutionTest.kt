package leetcoding.algorithms.problem0637

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest
import leetcoding.core.datastructure.TreeNode

internal class SolutionTest : ISolutionTest<TreeNode?, DoubleArray>() {

    override val solutions: List<ISolution<TreeNode?, DoubleArray>> = listOf(Solution1())

    override val testCases: List<Pair<TreeNode?, DoubleArray>> = listOf(
        TreeNode(3, TreeNode(9), TreeNode(20, TreeNode(15), TreeNode(7))) to doubleArrayOf(3.0, 14.5, 11.0)
    )
}
