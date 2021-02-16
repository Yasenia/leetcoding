package leetcoding.algorithms.problem0005

class Solution1 : Solution {
    override fun longestPalindrome(s: String): String {
        var longest = ""
        for (i in 0 until s.length * 2 - 1) {
            var a = (i + 1) / 2
            var b = i / 2
            while (a > 0 && b < s.length - 1 && s[a - 1] == s[b + 1]) {
                a--
                b++
            }
            if (b - a + 1 > longest.length) longest = s.substring(a, b + 1)
        }
        return longest
    }
}
