package leetcoding.algorithms.problem0051

import kotlin.math.abs

class Solution1 : Solution {

    override fun solveNQueens(n: Int): List<List<String>> = solveNQueens(n, 0, intArrayOf()).map { solution ->
        solution.map { ".".repeat(n).replaceRange(it, it + 1, "Q") }
    }

    private fun solveNQueens(n: Int, r: Int, queens: IntArray): List<IntArray> = when {
        r >= n -> listOf(queens)
        else -> (0 until n)
            .filter { c -> queens.withIndex().all { (qc, qr) -> qr != c && abs(qr - c) != r - qc } }
            .flatMap { solveNQueens(n, r + 1, queens + it) }
    }
}
