package leetcoding.algorithms.problem0832

import leetcoding.core.ISolution

interface Solution : ISolution<Array<IntArray>, Array<IntArray>> {
    override fun solve(input: Array<IntArray>): Array<IntArray> = flipAndInvertImage(input)

    fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray>
}
