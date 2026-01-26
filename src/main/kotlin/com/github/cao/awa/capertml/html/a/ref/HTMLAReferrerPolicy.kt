package org.github.cao.awa.com.github.cao.awa.capertml.html.a.ref

enum class HTMLAReferrerPolicy(val literal: String) {
    NO_REFERRER("no-referrer"),
    NO_REFERRER_WHEN_DOWNGRADE("no-referrer-when-downgrade"),
    ORIGIN("origin"),
    ORIGIN_WHEN_CROSS_ORIGIN("origin-when-cross-origin"),
    SAME_ORIGIN("same-origin"),
    STRICT_ORIGIN_WHEN_CROSS_ORIGIN("strict-origin-when-cross-origin"),
    UNSAFE_URL("unsafe-url")
}