package leetcoding.algorithms.problem1178

class Solution2 : Solution {

    override fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> {
        val wordBitsList = words.map { it.fold(0) { acc, c -> acc or (1 shl c - 'a') } }
        return puzzles.map { puzzle ->
            val excludeBits = puzzle.fold(0) { acc, c -> acc or (1 shl c - 'a') } xor ((1 shl 27) - 1)
            val firstBit = 1 shl (puzzle.first() - 'a')
            wordBitsList.count { firstBit and it != 0 && excludeBits and it == 0 }
        }
    }
}
