package leetcoding.algorithms.problem0386

class Solution1 : Solution {

    override fun lexicalOrder(n: Int): List<Int> = lexicalOrder((1..n).toList())

    private fun lexicalOrder(nums: List<Int>, sortIndex: Int = 0): List<Int> = if (nums.size <= 1) nums else nums
        .groupBy { it.digitAt(sortIndex) }
        .entries
        .sortedBy { it.key }
        .flatMap { lexicalOrder(it.value, sortIndex + 1) }

    private fun Int.digitAt(n: Int): Int {
        var a = this
        var b = this
        var i = n
        while (a >= 10) {
            a /= 10
            if (i-- <= 0) b /= 10
        }
        return if (i <= 0) b % 10 else -1
    }
}
