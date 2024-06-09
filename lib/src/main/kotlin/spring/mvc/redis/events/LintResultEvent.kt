package spring.mvc.redis.events

import java.util.UUID

class LintResultEvent (
    val snippetId: UUID,
    val status: LintStatus
)

enum class LintStatus {
    PASSED,
    PENDING,
    FAILED
}

