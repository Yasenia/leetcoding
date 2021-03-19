package leetcoding.algorithms.problem0455

class Solution1 : Solution {

    override fun findContentChildren(g: IntArray, s: IntArray): Int {
        val sortedG = g.sorted()
        val sortedS = s.sorted()
        var count = 0
        var j = 0
        for (i in sortedS.indices) {
            if (j > sortedG.lastIndex) break
            if (sortedG[j] > sortedS[i]) continue
            j++
            count++
        }
        return count
    }
}
