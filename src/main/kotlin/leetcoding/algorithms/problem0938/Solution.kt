package leetcoding.algorithms.problem0938

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 938](https://leetcode.com/problems/range-sum-of-bst/)
 * */
interface Solution : ISolution<Triple<TreeNode?, Int, Int>, Int> {

    override fun solve(input: Triple<TreeNode?, Int, Int>): Int = rangeSumBST(input.first, input.second, input.third)

    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int
}
