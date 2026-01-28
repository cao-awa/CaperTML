package org.github.cao.awa.com.github.cao.awa.capertml.html.head

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMeta
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.title.HTMLTitle

class HTMLHead: HTMLElement() {
    private var pageTitle: HTMLTitle = HTMLTitle()
    private var meta: HTMLHeadMeta = HTMLHeadMeta()

    fun pageTitle(title: HTMLTitle.() -> Unit) {
        title(this.pageTitle)
    }

    fun meta(meta: HTMLHeadMeta.() -> Unit) {
        meta(this.meta)
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Invalid scope, use 'pageTitle' instead")
    override fun title(title: String) {
        error("Cannot set title in <head> tag, use 'pageTitle' instead")
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<head")
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        builder.append(this.meta.toString(pretty, "$ident    "))
        builder.append(this.pageTitle.toString(pretty, "$ident    "))
        if (pretty) {
            builder.append("\n")
            builder.append(ident)
        }
        builder.append("</head>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}