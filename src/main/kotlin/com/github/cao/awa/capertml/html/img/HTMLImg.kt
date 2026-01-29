package org.github.cao.awa.com.github.cao.awa.capertml.html.img

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLPhrasingContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.style.height.HTMLHeightStyle
import org.github.cao.awa.com.github.cao.awa.capertml.style.unit.HTMLStyleNumberUnit
import org.github.cao.awa.com.github.cao.awa.capertml.style.width.HTMLWidthStyle

class HTMLImg: HTMLElement(), HTMLPhrasingContext {
    private var src: String = ""
    private var width: HTMLWidthStyle? = null
    private var height: HTMLHeightStyle? = null

    fun src(src: String) {
        this.src = src
    }

    fun width(style: HTMLWidthStyle) {
        this.width = style
    }

    fun width(size: Int, unit: HTMLStyleNumberUnit) {
        this.width = HTMLWidthStyle.of(size, unit)
    }

    fun height(style: HTMLHeightStyle) {
        this.height = style
    }

    fun height(size: Int, unit: HTMLStyleNumberUnit) {
        this.height = HTMLHeightStyle.of(size, unit)
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<img")
        if (this.src.isNotEmpty()) {
            builder.append(" src=\"${this.src}\"")
        }
        if (this.width != null) {
            builder.append(" width=\"${this.width!!.stringify()}\"")
        }
        if (this.height != null) {
            builder.append(" height=\"${this.height!!.stringify()}\"")
        }
        appendGlobal(builder)
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}