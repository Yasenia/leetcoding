package leetcoding.algorithms.problem0781

class Solution2 : Solution {

    override fun numRabbits(answers: IntArray): Int {
        val counter = IntArray(1000)
        for (num in answers) counter[num]++
        var sum = 0
        for ((num, count) in counter.withIndex()) if (count != 0) sum += (count + num) / (num + 1) * (num + 1)
        return sum
    }
}
