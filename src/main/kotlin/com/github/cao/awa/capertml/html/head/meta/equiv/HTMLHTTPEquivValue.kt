package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.equiv

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMeta

abstract class HTMLHTTPEquivValue<T: HTMLHTTPEquivValue<T>>(val type: HTMLHTTPEquivType<T>): HTMLHeadMeta<HTMLHTTPEquivValue<T>>(type) {
    abstract fun stringify(): String

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<meta")
        builder.append(" http-equiv=\"${this.type.literal}\"")
        builder.append(" content=\"${stringify()}\"")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}