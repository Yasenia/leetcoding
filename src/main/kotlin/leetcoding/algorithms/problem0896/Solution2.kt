package leetcoding.algorithms.problem0896

class Solution2 : Solution {

    override fun isMonotonic(array: IntArray): Boolean {
        var up = true
        var down = true
        for (i in 0 until array.lastIndex) {
            val diff = array[i + 1] - array[i]
            up = up.coerceAtMost(diff >= 0)
            down = down.coerceAtMost(diff <= 0)
            if (!up && !down) return false
        }
        return true
    }
}
