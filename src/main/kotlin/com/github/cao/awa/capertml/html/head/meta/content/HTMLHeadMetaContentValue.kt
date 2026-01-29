package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMeta

abstract class HTMLHeadMetaContentValue<T : HTMLHeadMetaContentValue<T>>(val type: HTMLHeadMetaContentType<T>) :
    HTMLHeadMeta<HTMLHeadMetaContentValue<T>>(
        type
    ) {
    abstract fun stringify(): String

    override fun valueLiteral(): String = stringify()

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<meta")
        builder.append(" name=\"${this.type.literal}\"")
        builder.append(" content=\"${stringify()}\"")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}