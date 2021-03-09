package leetcoding.algorithms.problem0032

class Solution1 : Solution {

    override fun longestValidParentheses(s: String): Int {
        var i = 0
        var longest = 0
        while (i <= s.lastIndex) {
            var count = 0
            var l = 0
            for (j in i..s.lastIndex) {
                if (s[j] == '(') count++ else if (count > 0) count-- else break
                if (count == 0) l = l.coerceAtLeast(j - i + 1)
            }
            longest = longest.coerceAtLeast(l)
            i += l + 1
        }
        return longest
    }
}
