package leetcoding.algorithms.problem0030

class Solution1 : Solution {

    override fun findSubstring(s: String, words: Array<String>): List<Int> {
        val wordLength = words.firstOrNull()?.length ?: return s.indices.toList()
        val subLength = words.size * wordLength
        val wordCounter = words.groupingBy { it }.eachCount()
        val result = mutableListOf<Int>()
        for (offset in 0 until wordLength) {
            val remained = wordCounter.toMutableMap()
            for (i in offset..s.length - wordLength step wordLength) {
                remained.compute(s.substring(i, i + wordLength)) { _, v -> v?.dec() ?: -1 }
                if (i >= subLength) remained.compute(s.substring(i - subLength, i - subLength + wordLength)) { _, v -> v?.inc() ?: 1 }
                if (remained.all { it.value == 0 }) result.add(i - subLength + wordLength)
            }
        }
        return result
    }
}
