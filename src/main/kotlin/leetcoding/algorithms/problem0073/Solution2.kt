package leetcoding.algorithms.problem0073

class Solution2 : Solution {

    override fun setZeroes(matrix: Array<IntArray>) {
        val zeroInFirstColumn = matrix.any { it[0] == 0 }
        for (row in matrix.indices) {
            for (column in 1..matrix[row].lastIndex) {
                if (matrix[row][column] != 0) continue
                matrix[0][column] = 0
                matrix[row][0] = 0
            }
        }
        for (row in matrix.indices.reversed()) {
            for (column in 1..matrix[row].lastIndex) {
                if (matrix[0][column] == 0 || matrix[row][0] == 0) matrix[row][column] = 0
            }
        }
        if (zeroInFirstColumn) for (row in 1..matrix.lastIndex) matrix[row][0] = 0
    }
}
