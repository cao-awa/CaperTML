package org.github.cao.awa.com.github.cao.awa.capertml.html.i

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

class HTMLI: HTMLElement(), HTMLTextable {
    private var text: String = ""

    fun text(text: String) {
        this.text = text
    }

    operator fun String.unaryPlus() {
        this@HTMLI.text = this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<i")
        appendGlobal(builder)
        builder.append(">")
        if (this.text.isNotEmpty()) {
            builder.append(this.text)
        }
        builder.append("</i>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}