package leetcoding.algorithms.problem0766

class Solution3 : Solution {

    override fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        for (i in 0 until rows - 1) {
            for (j in 0 until columns - 1) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) return false
            }
        }
        return true
    }
}
