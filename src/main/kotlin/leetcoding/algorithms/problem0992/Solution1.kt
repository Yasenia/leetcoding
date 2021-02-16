package leetcoding.algorithms.problem0992

class Solution1 : Solution {
    override fun subarraysWithKDistinct(array: IntArray, k: Int): Int = Dynamic(array).subarraysWithKDistinct(k)

    class Dynamic(private val array: IntArray) {
        private val dp = Array<Array<Int?>>(array.size) { Array(array.size) { null } }

        private fun calc(i: Int, j: Int): Int {
            if (i > j) return 0
            dp[i][j]?.also { return it }
            val subarraysWithoutJ = calc(i, j - 1)
            val subarrays = if (array.sliceArray(i until j).contains(array[j])) subarraysWithoutJ else subarraysWithoutJ + 1
            dp[i][j] = subarrays
            return subarrays
        }

        fun subarraysWithKDistinct(k: Int): Int {
            for (i in array.indices) for (j in i..array.lastIndex) calc(i, j)
            return dp.flatten().count { it == k }
        }
    }
}
