package leetcoding.algorithms.problem0783

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun minDiffInBST(root: TreeNode?): Int = minDiff(root, null, Int.MAX_VALUE)

    private fun minDiff(root: TreeNode?, pre: Int?, min: Int): Int {
        if (root == null) return min
        val leftMin = minDiff(root.left, pre, min)
        val currentMin = if (pre == null) leftMin else minOf(leftMin, root.value - pre)
        return minDiff(root.right, root.value, currentMin)
    }
}
