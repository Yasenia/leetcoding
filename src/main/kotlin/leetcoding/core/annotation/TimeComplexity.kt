package leetcoding.core.annotation

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class TimeComplexity(
    val value: Complexity
)
