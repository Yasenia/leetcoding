package leetcoding.algorithms.problem0318

class Solution2 : Solution {

    override fun maxProduct(words: Array<String>): Int {
        val masksLength = mutableMapOf<Int, Int>()
        for (word in words) {
            val mask = (0 until 26).filter { bit -> word.indexOf('a' + bit) >= 0 }.fold(0) { mask, bit -> 1 shl bit or mask }
            masksLength.compute(mask) { _, v -> word.length.coerceAtLeast(v ?: 0) }
        }
        val masks = masksLength.keys.toList()
        var maxProduct = 0
        for (i in masks.indices) {
            val mask1 = masks[i]
            for (j in i + 1..masks.lastIndex) {
                val mask2 = masks[j]
                if (mask1 and mask2 != 0) continue
                maxProduct = maxProduct.coerceAtLeast(masksLength[mask1]!! * masksLength[mask2]!!)
            }
        }
        return maxProduct
    }
}
