package leetcoding.algorithms.problem0978

import kotlin.math.sign

class Solution1 : Solution {

    override fun maxTurbulenceSize(arr: IntArray): Int {
        val dynamic = Dynamic(arr)
        var maxSize = 0
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (j - i + 1 > maxSize && dynamic.isTurbulence(i, j)) maxSize = j - i + 1
            }
        }
        return maxSize
    }

    class Dynamic(private val array: IntArray) {

        private val dp: MutableMap<Int, MutableMap<Int, Boolean>> = mutableMapOf()

        fun isTurbulence(i: Int, j: Int): Boolean {
            if (dp[i]?.get(j) != null) return dp[i]?.get(j)!!
            val value = when {
                i >= j -> true
                j - i == 1 -> array[i] != array[j]
                else -> isTurbulence(i + 1, j) && ((array[i] - array[i + 1]).sign * (array[i + 1] - array[i + 2]).sign < 0)
            }
            dp.getOrPut(i) { mutableMapOf() }[j] = value
            return value
        }
    }
}
