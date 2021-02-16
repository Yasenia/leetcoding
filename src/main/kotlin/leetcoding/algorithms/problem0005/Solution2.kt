package leetcoding.algorithms.problem0005

class Solution2 : Solution {

    override fun longestPalindrome(s: String): String {
        val matrix = Array(s.length) { Array<Boolean?>(s.length) { null } }
        var longestLength = 0
        var longestI = 0
        var longestJ = 0
        for (i in s.indices) {
            for (j in i until s.length) {
                calc(i, j, matrix, s)
                if (matrix[i][j] == true && j + 1 - i > longestLength) {
                    longestLength = j + 1 - i
                    longestI = i
                    longestJ = j
                }
            }
        }
        return s.substring(longestI, longestJ + 1)
    }

    private fun calc(i: Int, j: Int, matrix: Array<Array<Boolean?>>, s: String) {
        if (i > j || matrix[i][j] != null) return
        if (matrix.getOrNull(i + 1)?.getOrNull(j - 1) == null) calc(i + 1, j - 1, matrix, s)
        matrix[i][j] = s[i] == s[j] && (matrix.getOrNull(i + 1)?.getOrNull(j - 1) ?: true)
    }
}
