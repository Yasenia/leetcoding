package leetcoding.algorithms.problem0037

import java.util.BitSet

class Solution1 : Solution {

    override fun solveSudoku(board: Array<CharArray>) {
        val flattenBoard = board.flatMap { row -> row.map { if (it == '.') -1 else (it - '1') } }.toIntArray()
        Sudoku(flattenBoard).solve()
        for (i in flattenBoard.indices) board[i / 9][i % 9] = '1' + flattenBoard[i]
    }

    class Sudoku(private val board: IntArray) {
        private val rowCounters = Array(9) { BitSet(9) }
        private val columnCounters = Array(9) { BitSet(9) }
        private val gridCounters = Array(9) { BitSet(9) }

        init {
            board.forEachIndexed { index, n -> if (n != -1) relatedCounters(index / 9, index % 9).forEach { it.set(n) } }
        }

        private fun nextBlank(): Pair<Int, Int>? = board.indexOfFirst { it == -1 }.takeIf { it != -1 }?.let { Pair(it / 9, it % 9) }

        private fun relatedCounters(i: Int, j: Int) = arrayOf(rowCounters[i], columnCounters[j], gridCounters[i / 3 * 3 + j / 3])

        private fun reset(i: Int, j: Int, n: Int = -1): Boolean {
            val counters = relatedCounters(i, j)
            if (board[i * 9 + j] != -1) counters.forEach { it.clear(board[i * 9 + j]) }
            if (n != -1) {
                if (counters.any { it[n] }) return false
                counters.forEach { it.set(n) }
            }
            board[i * 9 + j] = n
            return true
        }

        fun solve(): Boolean {
            val (i, j) = this.nextBlank() ?: return true
            for (n in 0..8) {
                if (!this.reset(i, j, n)) continue
                if (this.solve()) return true
                this.reset(i, j)
            }
            return false
        }
    }
}
