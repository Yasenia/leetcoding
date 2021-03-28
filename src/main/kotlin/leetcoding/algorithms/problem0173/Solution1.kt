package leetcoding.algorithms.problem0173

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun buildBSTIterator(treeNode: TreeNode?): BSTIterator = BSTIterator1(treeNode)
}
