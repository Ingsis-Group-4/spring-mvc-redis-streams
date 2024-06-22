package spring.mvc.redis.events

class LintResultEvent (
    val userId: String,
    val snippetKey: String,
    val status: LintStatus
)

enum class LintStatus {
    PASSED,
    PENDING,
    FAILED
}

