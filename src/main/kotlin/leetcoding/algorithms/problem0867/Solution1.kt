package leetcoding.algorithms.problem0867

class Solution1 : Solution {

    override fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        return Array(columns) { i -> IntArray(rows) { j -> matrix[j][i] } }
    }
}
