package org.github.cao.awa.com.github.cao.awa.capertml.html.head

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.meta.HTMLHeadMeta
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.title.HTMLTitle
import java.util.LinkedList

class HTMLHead: HTMLElement() {
    private var pageTitle: HTMLTitle = HTMLTitle()
    private var meta: LinkedList<HTMLHeadMeta> = LinkedList()

    fun pageTitle(title: HTMLTitle.() -> Unit) {
        title(this.pageTitle)
    }

    fun meta(meta: HTMLHeadMeta.() -> Unit) {
        HTMLHeadMeta().also {
            meta(it)
            this.meta.add(it)
        }
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
        for (meta in this.meta) {
            builder.append(meta.toString(pretty, "$ident    "))
        }
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