package leetcoding.algorithms.problem0823

import leetcoding.core.math.modProduct
import leetcoding.core.math.modSum

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
                dp[i] = modSum(dp[i], listOf(dp[j], dp[k], multiple).modProduct())
            }
        }
        return dp.modSum()
    }
}
