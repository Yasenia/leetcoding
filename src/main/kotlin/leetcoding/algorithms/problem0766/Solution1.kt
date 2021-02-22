package leetcoding.algorithms.problem0766

class Solution1 : Solution {

    override fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean = isToeplitzMatrix(matrix, 0)

    private tailrec fun isToeplitzMatrix(matrix: Array<IntArray>, index: Int): Boolean {
        if (index >= matrix.lastIndex) return true
        for (i in 0 until matrix[index].lastIndex) if (matrix[index][i] != matrix[index + 1][i + 1]) return false
        return isToeplitzMatrix(matrix, index + 1)
    }
}
