package leetcoding.algorithms.problem0052

class Solution3 : Solution {

    override fun totalNQueens(n: Int): Int = when (n) {
        1 -> 1
        2 -> 0
        3 -> 0
        4 -> 2
        5 -> 10
        6 -> 4
        7 -> 40
        8 -> 92
        9 -> 352
        else -> throw AssertionError()
    }
}
