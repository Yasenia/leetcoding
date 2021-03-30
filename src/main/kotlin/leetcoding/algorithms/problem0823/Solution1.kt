package leetcoding.algorithms.problem0823

class Solution1 : Solution {

    override fun numFactoredBinaryTrees(arr: IntArray): Int {
        val sortedNums = arr.sorted()
        val numIndices = sortedNums.withIndex().associate { it.value to it.index }
        val dp = IntArray(arr.size) { 1 }
        for (i in dp.indices) {
            val num = sortedNums[i]
            for (j in 0 until i) {
                val factor1 = sortedNums[j]
                if (factor1 * factor1 > num) break
                if (num % factor1 != 0) continue
                val factor2 = num / factor1
                val k = numIndices[factor2] ?: continue
                val multiple = if (factor1 == factor2) 1 else 2
                dp[i] = (dp[i] + multiple * multiplyMod(dp[j], dp[k], 1000000007) % 1000000007) % 1000000007
            }
        }
        return dp.fold(0) { acc, i -> (acc + i) % 1000000007 }
    }

    private fun multiplyMod(n1: Int, n2: Int, mod: Int): Int = when {
        n1 == 0 -> 0
        n1 % 2 == 0 -> multiplyMod(n1 / 2, n2 * 2 % mod, mod)
        else -> (n2 + multiplyMod(n1 - 1, n2, mod)) % mod
    }
}
