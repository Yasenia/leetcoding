package leetcoding.algorithms.problem0904

class Solution1 : Solution {

    override fun totalFruit(tree: IntArray): Int {
        var pre1Fruit = -1
        var pre2Fruit = -1
        var total = 0
        var consequentTotal = 0
        var max = 0
        for (fruit in tree) {
            if (fruit == pre1Fruit || fruit == pre2Fruit) total++ else total = consequentTotal + 1
            if (fruit == pre1Fruit) consequentTotal++ else {
                pre2Fruit = pre1Fruit
                pre1Fruit = fruit
                consequentTotal = 1
            }
            max = max.coerceAtLeast(total)
        }
        return max
    }
}
