package leetcoding.algorithms.problem0036

class Solution1 : Solution {

    override fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            // row check
            if (!isValidGroup(board[i].toList())) return false
            // column check
            if (!isValidGroup(board.map { it[i] })) return false
            // grid check
            val grid = board.slice(i / 3 * 3 until (i / 3 + 1) * 3).flatMap { it.slice(i % 3 * 3 until (i % 3 + 1) * 3) }
            if (!isValidGroup(grid)) return false
        }
        return true
    }

    private fun isValidGroup(group: Iterable<Char>): Boolean {
        val counter = IntArray(9)
        for (c in group) if (c != '.' && counter[c - '1']++ != 0) return false
        return true
    }
}
