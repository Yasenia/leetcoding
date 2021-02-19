package leetcoding.algorithms.problem0022

class Solution1 : Solution {

    override fun generateParenthesis(n: Int): List<String> = generateParenthesis(n, "", 0)

    private fun generateParenthesis(n: Int, prefix: String, opens: Int): List<String> {
        if (n == 0) return listOf(prefix)
        val openList = if (opens < n) generateParenthesis(n, "$prefix(", opens + 1) else emptyList()
        val closeList = if (opens > 0) generateParenthesis(n - 1, "$prefix)", opens - 1) else emptyList()
        return openList + closeList
    }
}
