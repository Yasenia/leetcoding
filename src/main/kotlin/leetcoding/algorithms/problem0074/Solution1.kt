package leetcoding.algorithms.problem0074

class Solution1 : Solution {

    override fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val rows = matrix.size
        val columns = matrix.firstOrNull()?.size ?: 0
        var left = 0
        var right = rows * columns - 1
        while (left <= right) {
            val mid = (left + right) / 2
            val midValue = matrix[mid / columns][mid % columns]
            when {
                midValue < target -> left = mid + 1
                midValue > target -> right = mid - 1
                else -> return true
            }
        }
        return false
    }
}
