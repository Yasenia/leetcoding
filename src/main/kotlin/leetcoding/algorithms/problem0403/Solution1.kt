package leetcoding.algorithms.problem0403

class Solution1 : Solution {

    override fun canCross(stones: IntArray): Boolean = canCross(stones, 0, 0, Array(stones.size) { mutableMapOf() })

    private fun canCross(stones: IntArray, from: Int, step: Int, dp: Array<MutableMap<Int, Boolean>>): Boolean {
        if (dp[from][step] != null) return dp[from][step]!!
        if (from == stones.lastIndex) return true
        for (to in from + 1..stones.lastIndex) {
            val distance = stones[to] - stones[from]
            if (distance < step - 1) continue
            if (distance > step + 1) break
            val canCross = canCross(stones, to, distance, dp).also { dp[from][step] = it }
            if (canCross) return true
        }
        return false
    }
}
