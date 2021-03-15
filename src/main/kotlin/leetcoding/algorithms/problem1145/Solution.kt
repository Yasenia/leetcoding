package leetcoding.algorithms.problem1145

import leetcoding.core.ISolution
import leetcoding.core.datastructure.TreeNode

/**
 * [Problem 1145](https://leetcode.com/problems/binary-tree-coloring-game/)
 * */
interface Solution : ISolution<Triple<TreeNode?, Int, Int>, Boolean> {

    override fun solve(input: Triple<TreeNode?, Int, Int>): Boolean = btreeGameWinningMove(input.first?.copy(), input.second, input.third)

    fun btreeGameWinningMove(root: TreeNode?, n: Int, x: Int): Boolean
}
