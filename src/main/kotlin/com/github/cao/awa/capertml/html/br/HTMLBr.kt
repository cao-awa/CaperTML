package org.github.cao.awa.com.github.cao.awa.capertml.html.br

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.style.align.HTMLAlignType

class HTMLBr: HTMLElement(), HTMLTextable {
    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<br")
        appendGlobal(builder)
        builder.append(" />")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}