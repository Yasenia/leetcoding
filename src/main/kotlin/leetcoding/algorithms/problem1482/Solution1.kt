package leetcoding.algorithms.problem1482

class Solution1 : Solution {

    override fun minDays(bloomDay: IntArray, m: Int, k: Int): Int {
        if (m * k > bloomDay.size) return -1
        if (bloomDay.isEmpty()) return 0
        var low = bloomDay.minOrNull()!! - 1
        var high = bloomDay.maxOrNull()!!
        while (low + 1 < high) {
            val mid = (low + high) / 2
            if (isPossible(bloomDay, m, k, mid)) high = mid else low = mid
        }
        return high
    }

    private fun isPossible(bloomDay: IntArray, m: Int, k: Int, days: Int): Boolean {
        var acc = 0
        var remainder = m
        for (i in bloomDay.indices) {
            if (bloomDay.size - i < remainder * k - acc) return false
            val flowerBloomDay = bloomDay[i]
            if (flowerBloomDay <= days) acc++
            if (acc == k) remainder--
            if (acc == k || flowerBloomDay > days) acc = 0
            if (remainder == 0) return true
        }
        return false
    }
}
