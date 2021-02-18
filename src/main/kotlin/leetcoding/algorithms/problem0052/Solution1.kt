package leetcoding.algorithms.problem0052

import kotlin.math.abs

class Solution1 : Solution {

    override fun totalNQueens(n: Int): Int = solveNQueens(n, 0, intArrayOf()).size

    @Suppress("DuplicatedCode")
    private fun solveNQueens(n: Int, r: Int, queens: IntArray): List<IntArray> = when {
        r >= n -> listOf(queens)
        else -> (0 until n)
            .filter { c -> queens.withIndex().all { (qc, qr) -> qr != c && abs(qr - c) != r - qc } }
            .flatMap { solveNQueens(n, r + 1, queens + it) }
    }
}
