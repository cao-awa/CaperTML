package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType

open class HTMLAMediaValue(val type: HTMLAMediaValueType, val value: String) {
    open fun literal(): String {
        val builder = StringBuilder()
        builder.append(this.type.literal)
        builder.append(":")
        builder.append(this.value)
        return builder.toString()
    }
}