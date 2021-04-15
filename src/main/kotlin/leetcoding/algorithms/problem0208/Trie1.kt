package leetcoding.algorithms.problem0208

class Trie1 : Trie {

    private var isLeaf = false
    private val dict: MutableMap<Char, Trie1> = mutableMapOf()

    override fun insert(word: String) = insert(word, 0)

    private fun insert(word: String, i: Int) {
        if (word.length <= i) this.isLeaf = true else dict.compute(word[i]) { _, v -> v ?: Trie1() }?.insert(word, i + 1)
    }

    override fun search(word: String): Boolean = search(word, 0)

    private fun search(word: String, i: Int): Boolean =
        (word.length == i && this.isLeaf) || (i <= word.lastIndex && dict[word[i]]?.search(word, i + 1) ?: false)

    override fun startsWith(prefix: String): Boolean = startsWith(prefix, 0)

    private fun startsWith(prefix: String, i: Int): Boolean =
        prefix.length <= i || dict[prefix[i]]?.startsWith(prefix, i + 1) ?: false
}
