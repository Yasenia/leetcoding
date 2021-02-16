package leetcoding.algorithms.problem0567

import leetcoding.core.annotation.Complexity.O_N
import leetcoding.core.annotation.SpaceComplexity
import leetcoding.core.annotation.TimeComplexity

@TimeComplexity(O_N)
@SpaceComplexity(O_N)
class Solution2 : Solution {

    override fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        val freq = ShortArray(26)
        for (c in s1) freq[c - 'a']--
        for (i in s2.indices) {
            freq[s2[i] - 'a']++
            if (i >= s1.length) freq[s2[i - s1.length] - 'a']--
            if (freq.all { it.toInt() == 0 }) return true
        }
        return false
    }
}
