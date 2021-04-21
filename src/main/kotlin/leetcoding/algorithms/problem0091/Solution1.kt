package leetcoding.algorithms.problem0091

class Solution1 : Solution {

    override fun numDecodings(s: String): Int {
        if (s.isEmpty()) return 0
        val dp = IntArray(s.length + 1)
        dp[s.length] = 1
        dp[s.lastIndex] = if (s.last() in '1'..'9') 1 else 0
        for (i in s.lastIndex - 1 downTo 0) {
            if ((s[i] == '1' && s[i + 1] in '0'..'9') || (s[i] == '2' && s[i + 1] in '0'..'6')) dp[i] += dp[i + 2]
            if (s[i] in '1'..'9') dp[i] += dp[i + 1]
        }
        return dp.first()
    }
}
