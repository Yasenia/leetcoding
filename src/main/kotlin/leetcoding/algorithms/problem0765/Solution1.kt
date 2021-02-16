package leetcoding.algorithms.problem0765

class Solution1 : Solution {

    override fun minSwapsCouples(row: IntArray): Int {
        val positions = IntArray(row.size)
        for (i in row.indices) positions[row[i]] = i
        val flags = BooleanArray(row.size / 2)
        var cycleCount = 0
        for (startPosition in row.indices step 2) {
            if (flags[startPosition / 2]) continue
            var peoplePosition = startPosition
            do {
                flags[peoplePosition / 2] = true
                val people = row[peoplePosition]
                val couple = people xor 1
                val couplePosition = positions[couple]
                peoplePosition = couplePosition xor 1
            } while (couplePosition xor startPosition > 1)
            cycleCount++
        }
        return row.size / 2 - cycleCount
    }
}
