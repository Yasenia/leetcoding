package leetcoding.algorithms.problem0832

class Solution1 : Solution {

    override fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> =
        Array(image.size) { i -> IntArray(image[i].size) { j -> 1 - image[i][image[i].lastIndex - j] } }
}
