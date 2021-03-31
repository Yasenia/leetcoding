package leetcoding.algorithms.problem1175

import leetcoding.core.math.modProduct

class Solution1 : Solution {

    override fun numPrimeArrangements(n: Int): Int {
        val primesCount = primes().takeWhile { it <= n }.count()
        return modProduct(modFactorial(primesCount), modFactorial(n - primesCount))
    }

    private tailrec fun modFactorial(n: Int, acc: Int = 1): Int = if (n > 0) modFactorial(n - 1, modProduct(acc, n)) else acc

    private fun primes(): Sequence<Int> = mutableListOf<Int>().let { primes ->
        generateSequence(2) { it + 1 }.filter { primes.all { p -> it % p != 0 } }.onEach { primes.add(it) }
    }
}
