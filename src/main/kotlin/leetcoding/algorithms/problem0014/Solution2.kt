package leetcoding.algorithms.problem0014

class Solution2 : Solution {

    override fun longestCommonPrefix(strArray: Array<String>): String {
        val firstString = strArray.firstOrNull() ?: return ""
        val otherStrings = strArray.sliceArray(1..strArray.lastIndex)
        val sb = StringBuilder()
        for (i in firstString.indices) {
            for (otherString in otherStrings) if (otherString.getOrNull(i) != firstString[i]) return sb.toString()
            sb.append(firstString[i])
        }
        return sb.toString()
    }
}
