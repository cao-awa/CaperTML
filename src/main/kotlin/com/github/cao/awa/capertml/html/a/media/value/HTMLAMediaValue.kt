package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType

open class HTMLAMediaValue<T>(val type: HTMLAMediaValueType, val value: T, val prefix: String = "") {
    fun literal(): String {
        val builder = StringBuilder()
        if (this.prefix.isNotEmpty()) {
            builder.append(this.prefix)
            builder.append("-")
        }
        builder.append(this.type.literal)
        builder.append(":")
        builder.append(this.value)
        return builder.toString()
    }
}