package leetcoding.algorithms.problem0781

class Solution1 : Solution {

    override fun numRabbits(answers: IntArray): Int =
        answers.asSequence().groupingBy { it }.eachCount().map { (num, count) -> (count + num) / (num + 1) * (num + 1) }.sum()
}
