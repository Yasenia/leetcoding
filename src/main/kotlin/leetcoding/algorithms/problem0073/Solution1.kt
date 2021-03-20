package leetcoding.algorithms.problem0073

import java.util.BitSet

class Solution1 : Solution {

    override fun setZeroes(matrix: Array<IntArray>) {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        val rowFlags = BitSet(rows)
        val columnFlags = BitSet(columns)
        for (row in 0 until rows) {
            for (column in 0 until columns) {
                if (matrix[row][column] != 0) continue
                rowFlags.set(row)
                columnFlags.set(column)
            }
        }
        for (row in 0 until rows) {
            for (column in 0 until columns) {
                if (rowFlags[row] || columnFlags[column]) matrix[row][column] = 0
            }
        }
    }
}
