package leetcoding.algorithms.problem0872

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 872](https://leetcode.com/problems/leaf-similar-trees/)
 * */
interface Solution : ISolution<Pair<TreeNode?, TreeNode?>, Boolean> {

    override fun solve(input: Pair<TreeNode?, TreeNode?>): Boolean = leafSimilar(input.first, input.second)

    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean
}
