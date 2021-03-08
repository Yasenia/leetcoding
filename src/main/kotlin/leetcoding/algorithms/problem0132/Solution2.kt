package leetcoding.algorithms.problem0132

class Solution2 : Solution {

    override fun minCut(s: String): Int {
        val isPalindromes = Array(s.length) { BooleanArray(s.length) { true } }
        for (l in s.lastIndex downTo 0) {
            for (r in l + 1..s.lastIndex) {
                isPalindromes[l][r] = s[l] == s[r] && isPalindromes[l + 1][r - 1]
            }
        }
        val minCuts = IntArray(s.length + 1) { it - 1 }
        for (r in s.indices) {
            for (l in r downTo 0) {
                if (isPalindromes[l][r]) minCuts[r + 1] = minCuts[r + 1].coerceAtMost(minCuts[l] + 1)
            }
        }
        return minCuts[s.length]
    }
}
