package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContent
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentType
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot.HTMLHeadMetaRobotsContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.rebot.createRobots
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer.HTMLHeadMetaReferrerContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.referrer.createReferrer
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme.HTMLHeadMetaThemeColorContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.theme.createThemeColor
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.builder.HTMLHeadMetaViewportContentBuilder
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport.builder.createViewport
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

    fun content(content: HTMLHeadMetaContent<*>) {
        if (this.content != null) {
            error("Meta content already set")
        }
        this.content = content
    }

    fun viewport(builder: HTMLHeadMetaViewportContentBuilder.() -> Unit) {
        content(createViewport(builder))
    }

    fun themeColor(builder: HTMLHeadMetaThemeColorContentBuilder.() -> Unit) {
        content(createThemeColor(builder))
    }

    fun referrer(builder: HTMLHeadMetaReferrerContentBuilder.() -> Unit) {
        content(createReferrer(builder))
    }

    fun robots(builder: HTMLHeadMetaRobotsContentBuilder.() -> Unit) {
        content(createRobots(builder))
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