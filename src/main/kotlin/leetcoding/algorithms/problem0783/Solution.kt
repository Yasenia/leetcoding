package leetcoding.algorithms.problem0783

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

interface Solution : ISolution<TreeNode?, Int> {

    override fun solve(input: TreeNode?): Int = minDiffInBST(input)

    fun minDiffInBST(root: TreeNode?): Int
}
