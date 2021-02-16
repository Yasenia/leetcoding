package leetcoding.algorithms.problem0003

class Solution1 : Solution {

    override fun lengthOfLongestSubstring(s: String): Int = lengthOfLongestSubstring(s, 0, 0, 0)

    private tailrec fun lengthOfLongestSubstring(s: String, leftCursor: Int, rightCursor: Int, longest: Int): Int {
        val nextLongest = maxOf(rightCursor - leftCursor, longest)
        if (rightCursor >= s.length) return nextLongest
        val leftOffset = s.subSequence(leftCursor, rightCursor).indexOf(s[rightCursor])
        return lengthOfLongestSubstring(s, leftCursor + 1 + leftOffset, rightCursor + 1, nextLongest)
    }
}
