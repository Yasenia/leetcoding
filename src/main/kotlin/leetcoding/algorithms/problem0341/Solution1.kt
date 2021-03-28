package leetcoding.algorithms.problem0341

import leetcoding.core.datastructure.NestedInteger

class Solution1 : Solution {

    override fun buildNestedIterator(nestedList: List<NestedInteger>): NestedIterator = NestedIterator1(nestedList)
}
