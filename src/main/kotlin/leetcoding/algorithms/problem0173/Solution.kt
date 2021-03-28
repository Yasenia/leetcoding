package leetcoding.algorithms.problem0173

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 173](https://leetcode.com/problems/binary-search-tree-iterator/)
 * */
interface Solution : ISolution<TreeNode?, List<Int>> {

    override fun solve(input: TreeNode?): List<Int> {
        val bstIterator = buildBSTIterator(input)
        return generateSequence { if (bstIterator.hasNext()) bstIterator.next() else null }.toList()
    }

    fun buildBSTIterator(treeNode: TreeNode?): BSTIterator
}
