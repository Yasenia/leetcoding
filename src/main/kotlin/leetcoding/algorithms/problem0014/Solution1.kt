package leetcoding.algorithms.problem0014

class Solution1 : Solution {

    override fun longestCommonPrefix(strArray: Array<String>): String = longestCommonPrefix(strArray, 0, "")

    private fun longestCommonPrefix(strArray: Array<String>, index: Int, acc: String): String {
        val c = strArray.firstOrNull()?.getOrNull(index) ?: return acc
        return if (strArray.any { it.getOrNull(index) != c }) acc else longestCommonPrefix(strArray, index + 1, acc + c)
    }
}
