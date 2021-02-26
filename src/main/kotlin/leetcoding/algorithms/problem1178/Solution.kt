package leetcoding.algorithms.problem1178

import leetcoding.core.ISolution

/**
 * [Problem 1178](https://leetcode.com/problems/number-of-valid-words-for-each-puzzle/)
 * */
interface Solution : ISolution<Pair<Array<String>, Array<String>>, List<Int>> {

    override fun solve(input: Pair<Array<String>, Array<String>>): List<Int> = findNumOfValidWords(input.first, input.second)

    fun findNumOfValidWords(words: Array<String>, puzzles: Array<String>): List<Int>
}
