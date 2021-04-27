package leetcoding.algorithms.problem1011

class Solution1 : Solution {

    override fun shipWithinDays(weights: IntArray, d: Int): Int {
        var minSize = 0
        var maxSize = 0
        for (w in weights) maxSize += w
        while (minSize < maxSize - 1) {
            val mid = (minSize + maxSize) / 2
            if (canBeShip(weights, d, mid)) maxSize = mid else minSize = mid
        }
        return maxSize
    }

    private fun canBeShip(weights: IntArray, d: Int, size: Int): Boolean {
        var n = d
        var s = size
        for (w in weights) when {
            size < w -> return false
            s >= w -> s -= w
            n > 1 -> {
                n--
                s = size - w
            }
            else -> return false
        }
        return true
    }
}
