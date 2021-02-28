package leetcoding.algorithms.problem0896

class Solution1 : Solution {

    override fun isMonotonic(array: IntArray): Boolean = isMonotonic(array, 0, 0)

    private tailrec fun isMonotonic(array: IntArray, index: Int, sign: Int): Boolean = when {
        index >= array.lastIndex -> true
        (array[index + 1] - array[index]) * sign < 0 -> false
        array[index] < array[index + 1] -> isMonotonic(array, index + 1, 1)
        array[index] > array[index + 1] -> isMonotonic(array, index + 1, -1)
        else -> isMonotonic(array, index + 1, sign)
    }
}
