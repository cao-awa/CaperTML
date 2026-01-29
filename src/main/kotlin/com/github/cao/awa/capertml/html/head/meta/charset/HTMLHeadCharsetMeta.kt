package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.charset

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMeta
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMetaType
import java.nio.charset.Charset

class HTMLHeadCharsetMeta: HTMLHeadMeta<HTMLHeadCharsetMeta>(HTMLHeadMetaType.Companion.CHARSET) {
    private var charset: Charset? = null

    fun charset(charset: Charset) {
        if (this.charset != null) {
            error("Charset already set")
        }
        this.charset = charset
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<meta")
        if (this.charset != null) {
            builder.append(" charset=\"${this.charset!!.name()}\"")
        }
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}