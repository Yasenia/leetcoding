package leetcoding.algorithms.problem0022

class Solution2 : Solution {

    override fun generateParenthesis(n: Int): List<String> = generateParenthesis(n, Array(n + 1) { null })

    private fun generateParenthesis(n: Int, dp: Array<List<String>?>): List<String> {
        if (dp[n] == null) {
            dp[n] = (0 until n).flatMap { i ->
                val inParenthesisParts = generateParenthesis(i)
                val outParenthesisParts = generateParenthesis(n - 1 - i)
                inParenthesisParts.flatMap { inPart -> outParenthesisParts.map { outPart -> "($inPart)$outPart" } }
            }.ifEmpty { listOf("") }
        }
        return dp[n]!!
    }
}
