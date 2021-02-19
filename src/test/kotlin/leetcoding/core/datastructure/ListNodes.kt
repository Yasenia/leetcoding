package leetcoding.core.datastructure

fun linkedListOf(vararg values: Int): ListNode? =
    if (values.isEmpty()) null
    else ListNode(values.first(), linkedListOf(*values.sliceArray(1..values.lastIndex)))
