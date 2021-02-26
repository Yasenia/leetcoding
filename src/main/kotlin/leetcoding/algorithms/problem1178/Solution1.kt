package leetcoding.algorithms.problem1178

class Solution1 : Solution {

    override fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int> =
        puzzles.map { puzzle -> words.count { word -> puzzle.first() in word && word.all { it in puzzle } } }
}
