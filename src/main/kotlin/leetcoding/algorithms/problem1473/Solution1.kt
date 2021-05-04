package leetcoding.algorithms.problem1473

class Solution1 : Solution {

    override fun minCost(houses: IntArray, cost: Array<IntArray>, m: Int, n: Int, target: Int): Int {
        val dp = Array(m + 1) { Array(n + 1) { IntArray(target + 1) { -1 } } }
        for (color in 1..n) dp[0][color][0] = 0
        for (house in 1..m) {
            for (color in 1..n) {
                if (houses[house - 1] != 0 && houses[house - 1] != color) continue
                for (group in 1..target.coerceAtMost(house)) {
                    val preMinCost = (1..n).map { dp[house - 1][it][if (it == color) group else group - 1] }.filter { it >= 0 }.minOrNull() ?: continue
                    val currentCost = if (houses[house - 1] == color) 0 else cost[house - 1][color - 1]
                    dp[house][color][group] = preMinCost + currentCost
                }
            }
        }
        return (1..n).map { dp[m][it][target] }.filter { it >= 0 }.minOrNull() ?: -1
    }
}
