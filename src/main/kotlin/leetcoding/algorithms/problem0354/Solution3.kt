package leetcoding.algorithms.problem0354

import java.util.Collections

class Solution3 : Solution {

    override fun maxEnvelopes(envelopes: Array<IntArray>): Int {
        val heights = envelopes.sortedWith { e1, e2 -> if (e1[0] != e2[0]) e1[0] - e2[0] else e2[1] - e1[1] }.map { it[1] }
        val maxList = mutableListOf<Int>()
        for (height in heights) {
            if (height > maxList.lastOrNull() ?: 0) maxList.add(height)
            val i = Collections.binarySearch(maxList, height)
            maxList[if (i >= 0) i else -i - 1] = height
        }
        return maxList.size
    }
}
