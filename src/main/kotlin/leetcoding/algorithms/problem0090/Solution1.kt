package leetcoding.algorithms.problem0090

class Solution1 : Solution {

    override fun subsetsWithDup(nums: IntArray): List<List<Int>> =
        nums.groupBy { it }.values.fold(listOf(emptyList())) { result, dupNums -> result.flatMap { (0..dupNums.size).map { n -> it + dupNums.take(n) } } }
}
