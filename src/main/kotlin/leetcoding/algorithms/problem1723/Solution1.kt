package leetcoding.algorithms.problem1723

class Solution1 : Solution {

    override fun minimumTimeRequired(jobs: IntArray, k: Int): Int {
        var low = (jobs.maxOrNull() ?: 0) - 1
        var high = jobs.sum()
        val sortedJobs = jobs.sortedArrayDescending()
        val workload = IntArray(k)
        while (low + 1 < high) {
            val mid = (low + high) / 2
            for (i in workload.indices) workload[i] = 0
            if (isPossible(sortedJobs, k, mid, workload)) high = mid else low = mid
        }
        return high
    }

    private fun isPossible(jobs: IntArray, k: Int, limit: Int, workload: IntArray, i: Int = 0): Boolean {
        if (i > jobs.lastIndex) return true
        val job = jobs[i]
        for (worker in 0 until k) {
            if (workload[worker] + job > limit) continue
            val isLastTry = workload[worker] == 0 || workload[worker] == limit - job
            workload[worker] += job
            if (isPossible(jobs, k, limit, workload, i + 1)) return true
            workload[worker] -= job
            if (isLastTry) return false
        }
        return false
    }
}
