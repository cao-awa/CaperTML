package org.github.cao.awa.com.github.cao.awa.capertml.html.span

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLPhrasingContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLText
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import java.util.LinkedList

class HTMLSpan: HTMLElement(), HTMLTextable, HTMLPhrasingContext {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    operator fun String.unaryPlus() {
        this@HTMLSpan.elements.add(HTMLText().apply {
            text(this@unaryPlus)
        })
    }

    override fun text(text: String) {
        this.elements.add(HTMLText().apply {
            text(text)
        })
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<span")
        appendGlobal(builder)
        builder.append(">")
        if (pretty) {
            builder.append("\n")
        }
        for (element in this.elements) {
            builder.append(element.toString(pretty, "$ident    "))
        }
        if (pretty) {
            builder.append(ident)
        }
        builder.append("</span>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }
}