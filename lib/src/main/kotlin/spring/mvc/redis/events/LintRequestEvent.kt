package spring.mvc.redis.events

import java.util.UUID

data class LintRequestEvent (
    val snippetId: UUID,
    val ruleConfig: String,
)

