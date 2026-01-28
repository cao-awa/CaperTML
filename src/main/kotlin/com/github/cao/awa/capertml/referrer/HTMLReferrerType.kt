package org.github.cao.awa.com.github.cao.awa.capertml.referrer

enum class HTMLReferrerType(val literal: String) {
    NO_REFERRER("no-referrer"),
    NO_REFERRER_WHEN_DOWNGRADE("no-referrer-when-downgrade"),
    SAME_ORIGIN("same-origin"),
    ORIGIN("origin"),
    STRICT_ORIGIN("strict-origin"),
    ORIGIN_WHEN_CROSS_ORIGIN("origin-when-cross-origin"),
    STRICT_ORIGIN_WHEN_CROSS_ORIGIN("strict-origin-when-cross-origin"),
    UNSAFE_URL("unsafe-url")
}