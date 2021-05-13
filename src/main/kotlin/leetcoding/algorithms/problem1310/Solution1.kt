package leetcoding.algorithms.problem1310

class Solution1 : Solution {

    override fun xorQueries(arr: IntArray, queries: Array<IntArray>): IntArray {
        val prefixSum = IntArray(arr.size + 1)
        for (i in arr.indices) prefixSum[i + 1] = prefixSum[i] xor arr[i]
        return queries.map { prefixSum[it[0]] xor (prefixSum[it[1] + 1]) }.toIntArray()
    }
}
