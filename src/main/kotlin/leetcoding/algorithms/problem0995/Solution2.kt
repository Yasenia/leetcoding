package leetcoding.algorithms.problem0995

import java.util.BitSet

class Solution2 : Solution {

    override fun minKBitFlips(arr: IntArray, k: Int): Int {
        var counter = 0
        val diff = BitSet(arr.size + 1)
        var revFlag = false
        for (i in arr.indices) {
            revFlag = revFlag xor diff[i]
            if (arr[i] % 2 == 0 == revFlag) continue
            if (i > arr.size - k) return -1
            diff.flip(i + k)
            revFlag = !revFlag
            counter++
        }
        return counter
    }
}
