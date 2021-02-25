package leetcoding.algorithms.problem0363

class Solution1 : Solution {

    override fun maxSumSubmatrix(matrix: Array<IntArray>, k: Int): Int {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        val sumMatrix = Array(rows) { IntArray(columns) }
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                val s1 = sumMatrix.getOrNull(i - 1)?.getOrNull(j - 1) ?: 0
                val s2 = sumMatrix.getOrNull(i - 1)?.getOrNull(j) ?: 0
                val s3 = sumMatrix.getOrNull(i)?.getOrNull(j - 1) ?: 0
                sumMatrix[i][j] = s2 + s3 - s1 + matrix[i][j]
            }
        }
        var maxArea = Int.MIN_VALUE
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                for (h in 1..rows - i) {
                    for (w in 1..columns - j) {
                        val s1 = sumMatrix.getOrNull(i - 1)?.getOrNull(j - 1) ?: 0
                        val s2 = sumMatrix.getOrNull(i + h - 1)?.getOrNull(j - 1) ?: 0
                        val s3 = sumMatrix.getOrNull(i - 1)?.getOrNull(j + w - 1) ?: 0
                        val area = sumMatrix[i + h - 1][j + w - 1] - s2 - s3 + s1
                        if (area == k) return k
                        if (area < k) maxArea = maxArea.coerceAtLeast(area)
                    }
                }
            }
        }
        return maxArea
    }
}
