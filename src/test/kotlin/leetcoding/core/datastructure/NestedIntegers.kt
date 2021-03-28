package leetcoding.core.datastructure

fun nestedIntOf(vararg nestedList: NestedInteger) = NestedInteger().apply { nestedList.forEach { add(it) } }

fun nestedIntOf(value: Int) = NestedInteger(value)
