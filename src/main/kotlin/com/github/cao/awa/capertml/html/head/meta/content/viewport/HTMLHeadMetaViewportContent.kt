package org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.viewport

import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.content.HTMLHeadMetaContentValue
import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.HTMLStyleType

class HTMLHeadMetaViewportContent(val styles: MutableMap<HTMLStyleType, HTMLStyle>): HTMLHeadMetaContentValue() {
    override fun stringify(): String {
        val builder = StringBuilder()
        for ((type, style) in this.styles) {
            builder.append(type.literal)
            builder.append("=")
            builder.append(style.stringify())
            builder.append(",")
        }
        builder.delete(builder.length - 1, builder.length)
        return builder.toString()
    }
}