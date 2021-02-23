package leetcoding.algorithms.problem1052

class Solution1 : Solution {

    override fun maxSatisfied(customers: IntArray, grumpy: IntArray, x: Int): Int {
        var total = 0
        var maxIncrease = 0
        var increase = 0
        var left = 0
        for (right in customers.indices) {
            if (grumpy[right] == 0) total += customers[right] else increase += customers[right]
            if (right >= x && grumpy[left++] == 1) increase -= customers[left - 1]
            maxIncrease = maxIncrease.coerceAtLeast(increase)
        }
        return total + maxIncrease
    }
}
