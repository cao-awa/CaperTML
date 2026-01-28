package org.github.cao.awa.com.github.cao.awa.capertml.html.head.title

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement

class HTMLTitle: HTMLElement() {
    private var title: String = ""

    operator fun String.unaryPlus() {
        if (this@HTMLTitle.title.isNotEmpty()) {
            error("Title already set")
        }
        this@HTMLTitle.title = this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (this.title.isNotEmpty()) {
            if (pretty) {
                builder.append(ident)
            }
            builder.append("<title>")
            builder.append(this.title)
            builder.append("</title>")
        }
        return builder.toString()
    }
}