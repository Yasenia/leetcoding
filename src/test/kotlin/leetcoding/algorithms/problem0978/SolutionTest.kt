package leetcoding.algorithms.problem0978

import leetcoding.core.ISolution
import leetcoding.core.ISolutionTest

internal class SolutionTest : ISolutionTest<IntArray, Int>() {

    override val solutions: List<ISolution<IntArray, Int>> = listOf(Solution1(), Solution2(), Solution3(), Solution4())

    override val testCases: List<Pair<IntArray, Int>> = listOf(
        intArrayOf(9, 4, 2, 10, 7, 8, 8, 1, 9) to 5,
        intArrayOf(4, 8, 12, 16) to 2,
        intArrayOf(100) to 1,
        intArrayOf(100, 100, 100) to 1,
        intArrayOf(9, 9) to 1,
        intArrayOf(
            9080, 7595, 3488, 1872, 5813, 1238, 8798, 2114, 2047, 6437, 1719, 5095, 9036, 2318, 3453, 8455, 9441, 7752, 388, 4695, 1433, 8253, 1558,
            9068, 8432, 6751, 5897, 6993, 7763, 983, 6741, 9852, 9812, 5679, 7980, 8956, 5905, 7738, 3091, 3364, 9630, 5345, 1574, 255, 5215, 6863,
            9002, 7324, 6216, 6471, 2574, 6026, 5611, 7998, 1449, 2191, 4306, 525, 6534, 1692, 8114, 7021, 527, 2348, 9635, 2324, 3570, 3055, 4103,
            7944, 7374, 6151, 3644, 8000, 8316, 9096, 1432, 8358, 2162, 5009, 9644, 4710, 6776, 7098, 2452, 6169, 4133, 6061, 1541, 6780, 3089, 4506,
            8474, 9721, 6247, 3122, 7213, 9921, 1892, 6335
        ) to 10,
    )
}
