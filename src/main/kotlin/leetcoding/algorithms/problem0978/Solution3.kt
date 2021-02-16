package leetcoding.algorithms.problem0978

import kotlin.math.sign

class Solution3 : Solution {

    override fun maxTurbulenceSize(arr: IntArray): Int {
        if (arr.size <= 1) return arr.size
        var preSign = 0
        var preSize = 0
        var maxSize = 0
        for (i in 0 until arr.lastIndex) {
            val diff = arr[i + 1] - arr[i]
            val currentSize = if (diff == 0) 0 else if (diff.sign * preSign.sign < 0) preSize + 1 else 1
            preSign = diff.sign
            preSize = currentSize
            maxSize = maxOf(maxSize, currentSize)
        }
        return maxSize + 1
    }
}
