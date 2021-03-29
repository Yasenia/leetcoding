package leetcoding.algorithms.problem0654

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun constructMaximumBinaryTree(nums: IntArray): TreeNode? = nums.fold<TreeNode?>(null) { tree, num -> tree.insert(num) }

    private fun TreeNode?.insert(num: Int): TreeNode = when {
        this == null -> TreeNode(num)
        this.value < num -> TreeNode(num, this)
        else -> TreeNode(this.value, this.left, this.right.insert(num))
    }
}
