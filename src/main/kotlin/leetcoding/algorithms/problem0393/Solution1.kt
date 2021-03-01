package leetcoding.algorithms.problem0393

class Solution1 : Solution {

    override fun validUtf8(data: IntArray): Boolean = validUtf8(data, 0, 0)

    private fun validUtf8(data: IntArray, index: Int, tailCount: Int): Boolean {
        val byte = data.getOrNull(index) ?: return tailCount == 0
        return when {
            byte shr 3 == 0b11110 -> tailCount == 0 && validUtf8(data, index + 1, 3)
            byte shr 4 == 0b1110 -> tailCount == 0 && validUtf8(data, index + 1, 2)
            byte shr 5 == 0b110 -> tailCount == 0 && validUtf8(data, index + 1, 1)
            byte shr 6 == 0b10 -> tailCount > 0 && validUtf8(data, index + 1, tailCount - 1)
            byte shr 7 == 0b0 -> tailCount == 0 && validUtf8(data, index + 1, 0)
            else -> false
        }
    }
}
