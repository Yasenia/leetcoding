package leetcoding.algorithms.problem0017

class Solution1 : Solution {

    companion object {
        private val letterMapping = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz",
        )
    }

    override fun letterCombinations(digits: String): List<String> = letterCombinations(digits, 0, emptyList())

    private tailrec fun letterCombinations(digits: String, index: Int, prefixes: List<String>): List<String> {
        if (index > digits.lastIndex) return prefixes
        val letters = letterMapping[digits[index]] ?: ""
        val nextPrefix = if (prefixes.isEmpty()) letters.map { it.toString() } else letters.flatMap { letter -> prefixes.map { it + letter } }
        return letterCombinations(digits, index + 1, nextPrefix)
    }
}
