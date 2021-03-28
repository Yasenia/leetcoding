package leetcoding.algorithms.problem0387

class Solution1 : Solution {

    override fun firstUniqChar(s: String): Int {
        val counter = IntArray(26)
        for (c in s) counter[c - 'a']++
        for (i in s.indices) if (counter[s[i] - 'a'] == 1) return i
        return -1
    }
}
