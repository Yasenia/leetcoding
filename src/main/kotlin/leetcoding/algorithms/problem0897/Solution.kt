package leetcoding.algorithms.problem0897

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 897](https://leetcode.com/problems/increasing-order-search-tree/)
 * */
interface Solution : ISolution<TreeNode?, TreeNode?> {

    override fun solve(input: TreeNode?): TreeNode? = increasingBST(input)

    fun increasingBST(root: TreeNode?): TreeNode?
}
