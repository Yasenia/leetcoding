package leetcoding.algorithms.problem0028

class Solution2 : Solution {

    override fun strStr(haystack: String, needle: String): Int {
        val next = IntArray(needle.length) { -1 }
        for (i in 1..next.lastIndex) next[i] = needle.match(needle[i], next[i - 1], next)
        var index = 0
        var cursor = -1
        while (index <= haystack.lastIndex && cursor < needle.lastIndex) cursor = needle.match(haystack[index++], cursor, next)
        return if (cursor == needle.lastIndex) index - needle.length else -1
    }

    private fun String.match(c: Char, index: Int, next: IntArray): Int = when {
        this.getOrNull(index + 1) == c -> index + 1
        index in next.indices -> this.match(c, next[index], next)
        else -> -1
    }
}
