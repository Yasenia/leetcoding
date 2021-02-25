package leetcoding.algorithms.problem0363

import java.util.TreeSet

class Solution2 : Solution {

    override fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        var maxSum = Int.MIN_VALUE
        for (leftColumn in 0 until columns) {
            val rowSums = IntArray(rows)
            for (rightColumn in leftColumn until columns) {
                val prefixSumSet = TreeSet<Int>().apply { add(0) }
                var prefixSum = 0
                for (row in 0 until rows) {
                    rowSums[row] += matrix[row][rightColumn]
                    prefixSum += rowSums[row]
                    prefixSumSet.ceiling(prefixSum - k)?.let { maxSum = maxSum.coerceAtLeast(prefixSum - it) }
                    prefixSumSet.add(prefixSum)
                }
            }
        }
        return maxSum
    }
}
