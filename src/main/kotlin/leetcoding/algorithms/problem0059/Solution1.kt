package leetcoding.algorithms.problem0059

class Solution1 : Solution {

    override fun generateMatrix(n: Int): Array<IntArray> {
        val result = Array(n) { IntArray(n) }
        var num = 1
        var sideLength = n
        var i = 0
        var j = -1
        while (sideLength > 0) {
            repeat(sideLength--) { result[i][++j] = num++ }
            repeat(sideLength) { result[++i][j] = num++ }
            repeat(sideLength--) { result[i][--j] = num++ }
            repeat(sideLength) { result[--i][j] = num++ }
        }
        return result
    }
}
