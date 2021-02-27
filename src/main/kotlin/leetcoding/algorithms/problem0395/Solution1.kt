package leetcoding.algorithms.problem0395

import java.util.BitSet

class Solution1 : Solution {

    override fun longestSubstring(s: String, k: Int): Int {
        var longest = 0
        for (left in s.indices) {
            val counter = IntArray(26)
            val flag = BitSet(26)
            for (right in left..s.lastIndex) {
                val i = s[right] - 'a'
                counter[i] = counter[i] + 1
                flag.set(i, counter[i] < k)
                if (flag.isEmpty) longest = longest.coerceAtLeast(right - left + 1)
            }
        }
        return longest
    }
}
