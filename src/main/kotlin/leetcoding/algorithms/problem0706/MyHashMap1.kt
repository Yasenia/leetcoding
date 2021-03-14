package leetcoding.algorithms.problem0706

@Suppress("DuplicatedCode") // Some codes are looks similar to the solution of problem 705
class MyHashMap1 : MyHashMap {

    companion object {
        private const val LOAD_FACTOR = 0.75
        private const val DEFAULT_HIGHEST_BIT = 4
    }

    var size = 0
    private var highestBit = DEFAULT_HIGHEST_BIT
    private val capacity get() = 1 shl highestBit
    private var table: Array<Node?> = Array(capacity) { null }

    override fun put(key: Int, value: Int) {
        val hash = hash(key)
        var node = table[hash]
        while (node != null) {
            if (node.key == key) {
                node.value = value
                return
            }
            node = node.next
        }
        table[hash] = Node(key, value, table[hash])
        size++
        expandIfNeed()
    }

    override fun get(key: Int): Int {
        val hash = hash(key)
        var node = table[hash]
        while (node != null) {
            if (node.key == key) return node.value
            node = node.next
        }
        return -1
    }

    override fun remove(key: Int) {
        val hash = hash(key)
        val dummy = Node(0, 0, table[hash])
        var node: Node? = dummy
        while (node != null) {
            if (node.next?.key == key) {
                node.next = node.next?.next
                table[hash] = dummy.next
                size--
                return
            }
            node = node.next
        }
    }

    private fun hash(key: Int): Int = key.hashCode() and (capacity - 1)

    private fun expandIfNeed() {
        if (this.size < capacity * LOAD_FACTOR) return
        val newTable: Array<Node?> = Array(capacity shl 1) { null }
        for (i in table.indices) {
            var node = table[i]
            while (node != null) {
                if (1 shl highestBit and node.key.hashCode() == 0) newTable[i] = Node(node.key, node.value, newTable[i])
                else newTable[i + capacity] = Node(node.key, node.value, newTable[i + capacity])
                node = node.next
            }
        }
        highestBit++
        table = newTable
    }

    private class Node(val key: Int, var value: Int, var next: Node? = null)
}
