package spring.mvc.redis.events

data class LintRequestEvent (
    val userId: String,
    val snippetKey: String,
    val ruleConfig: String,
)

