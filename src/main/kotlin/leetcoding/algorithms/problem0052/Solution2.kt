package leetcoding.algorithms.problem0052

class Solution2 : Solution {

    override fun totalNQueens(n: Int): Int = totalNQueens(n, 0, 0, 0, 0)

    private fun totalNQueens(n: Int, row: Int, col: Int, ld: Int, rd: Int): Int {
        if (row >= n) return 1
        var queens = (col or ld or rd).inv() and ((1 shl n) - 1)
        var counter = 0
        while (queens > 0) {
            val queen = queens and -queens
            queens = queens and (queens - 1)
            counter += totalNQueens(n, row + 1, queen or col, queen or ld shl 1, queen or rd shr 1)
        }
        return counter
    }
}
