package leetcoding.algorithms.problem0995

class Solution1 : Solution {

    override fun minKBitFlips(arr: IntArray, k: Int): Int = minKBitFlips(arr.copyOf(), k, 0, 0)

    private fun minKBitFlips(arr: IntArray, k: Int, index: Int, counter: Int): Int = when {
        index > arr.lastIndex -> counter
        arr[index] != 0 -> minKBitFlips(arr, k, index + 1, counter)
        index <= arr.size - k -> {
            for (i in 0 until k) arr[index + i] = if (arr[index + i] == 0) 1 else 0
            minKBitFlips(arr, k, index + 1, counter + 1)
        }
        else -> -1
    }
}
