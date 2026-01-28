package org.github.cao.awa.com.github.cao.awa.capertml.html.h

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

class HTMLH4: HTMLTextable() {
    private var text: String? = null

    operator fun String.unaryPlus() {
        this@HTMLH4.text = this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<h4")
        appendGlobal(builder)
        builder.append(">")
        if (this.text != null) {
            builder.append(this.text)
        }
        builder.append("</h4>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}