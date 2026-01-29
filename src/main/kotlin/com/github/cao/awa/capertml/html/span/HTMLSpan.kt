package org.github.cao.awa.com.github.cao.awa.capertml.html.span

import org.github.cao.awa.com.github.cao.awa.capertml.html.HTMLElement
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextable
import org.github.cao.awa.com.github.cao.awa.capertml.html.text.HTMLTextableContainer
import java.util.LinkedList

class HTMLSpan: HTMLTextableContainer() {
    private val elements: LinkedList<HTMLElement> = LinkedList()

    override fun addTextable(textable: HTMLTextable) {
        this.elements.add(textable as HTMLElement)
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