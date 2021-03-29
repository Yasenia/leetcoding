package leetcoding.algorithms.problem0654

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 654](https://leetcode.com/problems/maximum-binary-tree/submissions/)
 * */
interface Solution : ISolution<IntArray, TreeNode?> {

    override fun solve(input: IntArray): TreeNode? = constructMaximumBinaryTree(input)

    fun constructMaximumBinaryTree(nums: IntArray): TreeNode?
}
