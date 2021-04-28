package leetcoding.algorithms.problem0938

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        if (root == null) return 0
        if (root.value > high) return rangeSumBST(root.left, low, high)
        if (root.value < low) return rangeSumBST(root.right, low, high)
        return root.value + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high)
    }
}
