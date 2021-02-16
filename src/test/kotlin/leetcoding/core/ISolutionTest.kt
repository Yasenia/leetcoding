package leetcoding.core

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
abstract class ISolutionTest<Input, Output> {

    protected abstract val solutions: List<ISolution<Input, Output>>
    protected abstract val testCases: List<Pair<Input, Output>>

    private fun test() = solutions.flatMap { solution -> testCases.map { (input, output) -> arguments(solution, input, output) } }.stream()

    @ParameterizedTest
    @MethodSource
    fun test(solution: ISolution<Input, Output>, input: Input, output: Output) = assertThat(solution.solve(input), equalTo(output))
}
