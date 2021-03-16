package leetcoding.algorithms.problem0318

class Solution1 : Solution {

    override fun maxProduct(words: Array<String>): Int {
        val masks = IntArray(words.size) { (0 until 26).filter { bit -> words[it].indexOf('a' + bit) >= 0 }.fold(0) { mask, bit -> 1 shl bit or mask } }
        var maxProduct = 0
        for (i in words.indices) {
            for (j in i + 1..words.lastIndex) {
                if (masks[i] and masks[j] == 0) maxProduct = maxProduct.coerceAtLeast(words[i].length * words[j].length)
            }
        }
        return maxProduct
    }
}
