package leetcoding.algorithms.problem0637

import leetcoding.core.datastructure.TreeNode

class Solution1 : Solution {

    override fun averageOfLevels(root: TreeNode?): DoubleArray {
        val sums = mutableListOf<Double>()
        val counts = mutableListOf<Int>()
        search(root, sums, counts)
        return DoubleArray(sums.size) { sums[it] / counts[it] }
    }

    private fun search(root: TreeNode?, sums: MutableList<Double>, counts: MutableList<Int>, depth: Int = 0) {
        if (root == null) return
        if (depth <= sums.lastIndex) sums[depth] += root.value.toDouble() else sums += root.value.toDouble()
        if (depth <= counts.lastIndex) counts[depth] += 1 else counts += 1
        search(root.left, sums, counts, depth + 1)
        search(root.right, sums, counts, depth + 1)
    }
}
