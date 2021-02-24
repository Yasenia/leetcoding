package leetcoding.algorithms.problem0028

class Solution1 : Solution {

    override fun strStr(haystack: String, needle: String): Int = strStr(haystack, needle, 0, 0)

    private fun strStr(haystack: String, needle: String, index: Int, offset: Int): Int = when {
        offset > needle.lastIndex -> index - offset
        index > haystack.lastIndex -> -1
        haystack[index] == needle[offset] -> strStr(haystack, needle, index + 1, offset + 1)
        else -> strStr(haystack, needle, index - offset + 1, 0)
    }
}
