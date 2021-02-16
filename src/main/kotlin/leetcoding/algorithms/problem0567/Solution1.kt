package leetcoding.algorithms.problem0567

class Solution1 : Solution {

    override fun checkInclusion(s1: String, s2: String): Boolean = check(s1, s2)

    private fun check(
        target: String,
        s: String,
        left: Int = 0,
        right: Int = -1,
        freq: Map<Char, Int> = target.groupBy { it }.mapValues { -it.value.count() },
    ): Boolean = when {
        freq.all { (_, value) -> value == 0 } -> true
        right >= s.lastIndex -> false
        right - left + 1 < target.length -> check(target, s, left, right + 1, freq.increase(s[right + 1]))
        else -> check(target, s, left + 1, right + 1, freq.increase(s[right + 1]).decrease(s[left]))
    }

    private fun Map<Char, Int>.increase(key: Char) = this + (key to (this[key] ?: 0) + 1)
    private fun Map<Char, Int>.decrease(key: Char) = this + (key to (this[key] ?: 0) - 1)
}
