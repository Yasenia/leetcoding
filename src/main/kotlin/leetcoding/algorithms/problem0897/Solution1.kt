package leetcoding.algorithms.problem0897

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun increasingBST(root: TreeNode?): TreeNode? {
        val list = mutableListOf<Int>()
        search(root, list)
        val dummy = TreeNode(0)
        var node = dummy
        for (valueNode in list.map { TreeNode(it) }) {
            node.right = valueNode
            node = valueNode
        }
        return dummy.right
    }

    private fun search(root: TreeNode?, list: MutableList<Int>) {
        if (root == null) return
        search(root.left, list)
        list += root.value
        search(root.right, list)
    }
}
