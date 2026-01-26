package org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.value

import org.github.cao.awa.com.github.cao.awa.capertml.html.a.media.HTMLAMediaValueType

class HTMLAMediaWidthValue(type: HTMLAMediaValueType, value: String, val prefix: String = ""): HTMLAMediaValue(type, value) {
    override fun literal(): String {
        val builder = StringBuilder()
        builder.append(this.prefix)
        builder.append("-")
        builder.append(this.type.literal)
        builder.append(":")
        builder.append(this.value)
        return builder.toString()
    }
}