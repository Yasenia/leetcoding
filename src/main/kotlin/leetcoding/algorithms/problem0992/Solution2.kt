package leetcoding.algorithms.problem0992

class Solution2 : Solution {

    override fun subarraysWithKDistinct(array: IntArray, k: Int): Int {
        var count = 0
        for (i in array.indices) {
            val e1 = endOfShortestArray(array, k, i) ?: continue
            val e2 = endOfShortestArray(array, k + 1, i) ?: array.size
            count += e2 - e1
        }
        return count
    }

    private fun endOfShortestArray(array: IntArray, k: Int, index: Int, elements: Set<Int> = emptySet()): Int? {
        if (index > array.lastIndex) return null
        if (elements.contains(array[index])) return endOfShortestArray(array, k, index + 1, elements)
        if (k == 1) return index
        return endOfShortestArray(array, k - 1, index + 1, elements + array[index])
    }
}
