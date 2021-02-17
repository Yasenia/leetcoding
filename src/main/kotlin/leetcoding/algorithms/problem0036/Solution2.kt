package leetcoding.algorithms.problem0036

class Solution2 : Solution {

    override fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rowCounters = Array(9) { IntArray(9) }
        val columnCounters = Array(9) { IntArray(9) }
        val gridCounters = Array(9) { IntArray(9) }
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                val c = board[i][j].takeIf { it != '.' } ?: continue
                val n = c - '1'
                if (rowCounters[i][n]++ != 0 || columnCounters[j][n]++ != 0 || gridCounters[i / 3 * 3 + j / 3][n]++ != 0) return false
            }
        }
        return true
    }
}
