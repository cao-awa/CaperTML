package org.github.cao.awa.com.github.cao.awa.capertml.html.small

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLPhrasingContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

class HTMLSmall: HTMLElement(), HTMLTextable, HTMLPhrasingContext {
    private var text: String = ""

    override fun text(text: String) {
        this.text = text
    }

    operator fun String.unaryPlus() {
        this@HTMLSmall.text = this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<small")
        appendGlobal(builder)
        builder.append(">")
        if (this.text.isNotEmpty()) {
            builder.append(this.text)
        }
        builder.append("</small>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}