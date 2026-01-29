package org.github.cao.awa.com.github.cao.awa.capertml.html.text

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement

class HTMLText: HTMLElement() {
    private var text: String = ""

    fun text(text: String) {
        this.text = text
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append(this.text)
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}