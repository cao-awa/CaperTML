package org.github.cao.awa.com.github.cao.awa.capertml.html.abbr

import org.github.cao.awa.com.github.cao.awa.capertml.context.HTMLFlowContext
import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLText
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import java.util.LinkedList

class HTMLAbbr(private var text: HTMLText) : HTMLElement(), HTMLTextable, HTMLFlowContext {
    private var elements: LinkedList<HTMLElement> = LinkedList()

    operator fun String.unaryPlus() {
        addElement(HTMLText().also {
            it.text(this)
        })
    }

    override fun toString(pretty: Boolean, ident: String): String {
        val builder = StringBuilder()
        if (pretty) {
            builder.append(ident)
        }
        builder.append("<abbr")
        if (getTitle().isNotEmpty()) {
            builder.append(" title=")
            builder.append(getTitle())
        }
        builder.append(">")
        builder.append(this.text.toString(pretty, "$ident    "))
        builder.append("</abbr>")
        if (pretty) {
            builder.append("\n")
        }
        return builder.toString()
    }

    override fun text(text: String) {
        this.text = HTMLText().apply {
            text(text)
        }
    }

    override fun addElement(element: HTMLElement) {
        this.elements.add(element)
    }
}