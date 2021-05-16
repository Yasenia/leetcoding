package leetcoding.algorithms.problem0872

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean = root1.leaves() == root2.leaves()

    private fun TreeNode?.leaves(): List<Int> = when {
        this == null -> emptyList()
        this.left == null && this.right == null -> listOf(this.value)
        else -> left.leaves() + right.leaves()
    }
}
