package leetcoding.algorithms.problem0007

class Solution1 : Solution {

    override fun reverse(x: Int): Int = reverse(x, 0)

    private tailrec fun reverse(x: Int, acc: Int): Int {
        if (x > 0 && acc > (Int.MAX_VALUE - x) / 10) return 0
        if (x < 0 && acc < (Int.MIN_VALUE - x) / 10) return 0
        if (x == 0) return acc
        return reverse(x / 10, acc * 10 + x % 10)
    }
}
