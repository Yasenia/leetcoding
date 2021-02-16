package leetcoding.algorithms.problem0119

class Solution1 : Solution {

    override fun getRow(rowIndex: Int): List<Int> {
        if (rowIndex <= 0) return listOf(1)
        val preRow = getRow(rowIndex - 1)
        return listOf(1) + preRow.zipWithNext().map { (a, b) -> a + b } + 1
    }
}
