package leetcoding.algorithms.problem0766

class Solution2 : Solution {

    override fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        for (i in 1 until rows + columns) {
            var c = (i - rows).coerceAtLeast(0)
            var r = (rows - i).coerceAtLeast(0)
            val value = matrix[r][c]
            while (++c < columns && ++r < rows) if (matrix[r][c] != value) return false
        }
        return true
    }
}
