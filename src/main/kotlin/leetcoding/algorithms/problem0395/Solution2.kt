package leetcoding.algorithms.problem0395

class Solution2 : Solution {

    override fun longestSubstring(s: String, k: Int): Int {
        val counter = IntArray(26)
        for (i in s.indices) counter[s[i] - 'a']++
        val delimiters = counter.withIndex().filter { it.value in 1 until k }.map { 'a' + it.index }
        if (delimiters.isEmpty()) return s.length
        return s.split(*delimiters.toCharArray()).maxOf { longestSubstring(it, k) }
    }
}
