package leetcoding.algorithms.problem0010

class Solution2 : Solution {

    override fun isMatch(s: String, p: String): Boolean {
        val dynamic = Dynamic(s, p)
        return dynamic.calc(s.length, p.length)
    }

    class Dynamic(private val s: String, private val p: String) {
        private val dp = Array<Array<Boolean?>>(s.length + 1) { Array(p.length + 1) { null } }

        fun calc(m: Int, n: Int): Boolean {
            if (m < 0) return false
            if (n == 0) return m == 0
            val pc = p[n - 1]
            val value = dp[m][n] ?: if (pc == '*') calc(m, n - 2) || (s.getOrNull(m - 1).symbolMatch(p[n - 2]) && calc(m - 1, n))
            else s.getOrNull(m - 1).symbolMatch(pc) && calc(m - 1, n - 1)
            dp[m][n] = value
            return value
        }

        private fun Char?.symbolMatch(pc: Char) = this != null && (pc == '.' || pc == this)
    }
}
