package org.github.cao.awa.com.github.cao.awa.capertml.html.head

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.head.title.HTMLTitle

class HTMLHead: HTMLElement() {
    private var pageTitle: HTMLTitle = HTMLTitle()

    fun pageTitle(body: HTMLTitle.() -> Unit) {
        body(this.pageTitle)
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