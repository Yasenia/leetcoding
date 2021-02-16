package leetcoding.core.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class SpaceComplexity(
    val value: Complexity
)
