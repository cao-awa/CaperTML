package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import java.nio.charset.Charset

class HTMLHeadMeta: HTMLElement() {
    private var charset: Charset? = null
    private var content: HTMLHeadMetaContent<*>? = null

    fun charset(charset: Charset) {
        if (this.charset != null) {
            error("Charset already set")
        }
        this.charset = charset
    }

    fun content(name: HTMLHeadMetaContent<*>) {
        if (this.content != null) {
            error("Name already set")
        }
        this.content = name
    }

    fun <T: HTMLHeadMetaContentValue<T>> content(type: HTMLHeadMetaContentType<T>, value: T) {
        content(
            HTMLHeadMetaContent(type, value)
        )
    }

    fun <T: HTMLHeadMetaContentValue<T>> content(value: T) {
        content(
            HTMLHeadMetaContent(value.type, value)
        )
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<meta")
        if (this.charset != null) {
            builder.append(" charset=\"${this.charset!!.name()}\"")
        } else {
            builder.append(" charset=\"UTF-8\"")
        }
        if (this.content != null) {
            builder.append(" name=\"${this.content!!.type.literal}\"")
            builder.append(" content=\"${this.content!!.value.stringify()}\"")
        }
        builder.append(">")
        builder.append("</meta>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}