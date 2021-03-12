package leetcoding.algorithms.problem0174

class Solution1 : Solution {

    override fun calculateMinimumHP(dungeon: Array<IntArray>): Int {
        val dp = Array(dungeon.size) { IntArray(dungeon[it].size) }
        for (i in dungeon.indices.reversed()) {
            for (j in dungeon[i].indices.reversed()) {
                val downHP = dp.getOrNull(i + 1)?.getOrNull(j)
                val rightHP = dp.getOrNull(i)?.getOrNull(j + 1)
                dp[i][j] = ((listOfNotNull(downHP, rightHP).minOrNull() ?: 1) - dungeon[i][j]).coerceAtLeast(1)
            }
        }
        return dp[0][0]
    }
}
