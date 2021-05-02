package leetcoding.algorithms.problem0554

class Solution1 : Solution {

    override fun leastBricks(wall: List<List<Int>>): Int {
        val counter = mutableMapOf<Int, Int>()
        var max = 0
        for (row in wall) {
            var position = 0
            for (i in 0 until row.lastIndex) {
                position += row[i]
                max = max.coerceAtLeast(counter.compute(position) { _, v -> v?.inc() ?: 1 }!!)
            }
        }
        return wall.size - max
    }
}
