package leetcoding.algorithms.problem0008

class Solution1 : Solution {

    override fun myAtoi(s: String): Int {
        val trimString = s.trimStart()
        if (trimString.startsWith('-')) return atoi(trimString.substring(1).toCharArray(), false)
        if (trimString.startsWith('+')) return atoi(trimString.substring(1).toCharArray(), true)
        return atoi(trimString.toCharArray(), true)
    }

    private fun atoi(s: CharArray, positive: Boolean, cursor: Int = 0, acc: Int = 0): Int {
        val char = s.getOrNull(cursor) ?: return acc
        val digit = "0123456789".indexOf(char).takeIf { it >= 0 }?.let { if (positive) it else -it } ?: return acc
        if (positive && acc > (Int.MAX_VALUE - digit) / 10) return Int.MAX_VALUE
        if (!positive && acc < (Int.MIN_VALUE - digit) / 10) return Int.MIN_VALUE
        return atoi(s, positive, cursor + 1, acc * 10 + digit)
    }
}
