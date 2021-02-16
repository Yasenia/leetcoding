package leetcoding.algorithms.problem0010

class Solution1 : Solution {

    override fun isMatch(s: String, p: String): Boolean = sequenceMatch(s, p, 0, 0)

    private fun sequenceMatch(s: String, p: String, offsetS: Int, offsetP: Int): Boolean = when {
        p.length == offsetP -> s.length == offsetS
        p.getOrNull(offsetP + 1) == '*' ->
            (symbolMatch(s, p, offsetS, offsetP) && sequenceMatch(s, p, offsetS + 1, offsetP)) || sequenceMatch(s, p, offsetS, offsetP + 2)
        else -> symbolMatch(s, p, offsetS, offsetP) && sequenceMatch(s, p, offsetS + 1, offsetP + 1)
    }

    private fun symbolMatch(s: String, p: String, offsetS: Int, offsetP: Int): Boolean = s.length > offsetS && (p[offsetP] == '.' || p[offsetP] == s[offsetS])
}
