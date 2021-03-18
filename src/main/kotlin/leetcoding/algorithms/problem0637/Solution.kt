package leetcoding.algorithms.problem0637

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 637](https://leetcode.com/problems/average-of-levels-in-binary-tree/)
 * */
interface Solution : ISolution<TreeNode?, DoubleArray> {

    override fun solve(input: TreeNode?): DoubleArray = averageOfLevels(input)

    fun averageOfLevels(root: TreeNode?): DoubleArray
}
