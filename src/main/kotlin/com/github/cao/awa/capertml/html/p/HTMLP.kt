package org.github.cao.awa.com.github.cao.awa.capertml.html.p

import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable

class HTMLP: HTMLTextable() {
    private var text: String? = null

    operator fun String.unaryPlus() {
        this@HTMLP.text = this
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<p>")
        if (this.text != null) {
            builder.append(this.text)
        }
        builder.append("</p>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}