package leetcoding.algorithms.problem0013

class Solution2 : Solution {

    override fun romanToInt(s: String): Int {
        var sum = 0
        for (i in s.indices) {
            val value = s.romanValueOf(i)
            sum += if (s.romanValueOf(i + 1) > value) -value else value
        }
        return sum
    }

    private fun String.romanValueOf(index: Int) = when (this.getOrNull(index)) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}
