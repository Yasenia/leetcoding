package leetcoding.algorithms.problem1042

class Solution1 : Solution {

    companion object {
        private val FLOWER_TYPES = setOf(1, 2, 3, 4)
    }

    override fun gardenNoAdj(n: Int, paths: Array<IntArray>): IntArray {
        val connectedGardens = Array(n) { mutableSetOf<Int>() }
        for (path in paths) connectedGardens[path.maxOrNull()!! - 1].add(path.minOrNull()!! - 1)
        val result = IntArray(n)
        for (i in 0 until n) result[i] = (FLOWER_TYPES - connectedGardens[i].map { result[it] }).first()
        return result
    }
}
