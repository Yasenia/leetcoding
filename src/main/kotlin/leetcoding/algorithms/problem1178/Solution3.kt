package leetcoding.algorithms.problem1178

class Solution3 : Solution {

    override fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> {
        val wordBitsMap = words.groupingBy { it.fold(0) { acc, c -> acc or (1 shl c - 'a') } }.eachCount()
        return puzzles.map { puzzle ->
            val puzzleBits = puzzle.fold(0) { acc, c -> acc or (1 shl c - 'a') }
            val firstBit = 1 shl (puzzle.first() - 'a')
            generateSequence(puzzleBits) { it - 1 and puzzleBits }.takeWhile { it > 0 }.sumOf { if (it and firstBit == 0) 0 else wordBitsMap[it] ?: 0 }
        }
    }
}
