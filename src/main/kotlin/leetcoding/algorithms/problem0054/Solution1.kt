package leetcoding.algorithms.problem0054

class Solution1 : Solution {

    override fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val result = mutableListOf<Int>()
        var rows = matrix.size
        var columns = matrix.firstOrNull()?.size ?: 0
        var direction = 0
        var i = 0
        var j = -1
        while (rows > 0 && columns > 0) when (direction++ % 4) {
            0 -> repeat(columns) { result.add(matrix[i][++j]) }.also { rows-- }
            1 -> repeat(rows) { result.add(matrix[++i][j]) }.also { columns-- }
            2 -> repeat(columns) { result.add(matrix[i][--j]) }.also { rows-- }
            3 -> repeat(rows) { result.add(matrix[--i][j]) }.also { columns-- }
        }
        return result
    }
}
