package leetcoding.algorithms.problem0304

class NumMatrix1(matrix: Array<IntArray>) : NumMatrix {

    private val prefixSumMatrix: Array<IntArray> = Array(matrix.size) { IntArray(matrix[it].size) }

    init {
        for (row in matrix.indices) {
            for (col in matrix[row].indices) {
                val s1 = prefixSumMatrix.getOrNull(row - 1)?.getOrNull(col - 1) ?: 0
                val s2 = prefixSumMatrix.getOrNull(row)?.getOrNull(col - 1) ?: 0
                val s3 = prefixSumMatrix.getOrNull(row - 1)?.getOrNull(col) ?: 0
                prefixSumMatrix[row][col] = s2 + s3 - s1 + matrix[row][col]
            }
        }
    }

    override fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        val s1 = prefixSumMatrix.getOrNull(row1 - 1)?.getOrNull(col1 - 1) ?: 0
        val s2 = prefixSumMatrix.getOrNull(row2)?.getOrNull(col1 - 1) ?: 0
        val s3 = prefixSumMatrix.getOrNull(row1 - 1)?.getOrNull(col2) ?: 0
        return prefixSumMatrix[row2][col2] - s2 - s3 + s1
    }
}
