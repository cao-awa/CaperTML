package org.github.cao.awa.com.github.cao.awa.capertml.html.hr

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement

class HTMLHr: HTMLElement() {
    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<hr />")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}