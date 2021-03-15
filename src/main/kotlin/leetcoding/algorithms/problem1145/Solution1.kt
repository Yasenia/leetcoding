package leetcoding.algorithms.problem1145

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun btreeGameWinningMove(root: TreeNode?, n: Int, x: Int): Boolean {
        val node = root.nodeOf(x)
        val leftSize = node?.left.size()
        val rightSize = node?.right.size()
        val parentSize = n - 1 - leftSize - rightSize
        return maxOf(leftSize, rightSize, parentSize) > n / 2
    }

    private fun TreeNode?.nodeOf(x: Int): TreeNode? = if (this == null || value == x) this else left?.nodeOf(x) ?: right?.nodeOf(x)

    private fun TreeNode?.size(): Int = if (this == null) 0 else left.size() + right.size() + 1
}
